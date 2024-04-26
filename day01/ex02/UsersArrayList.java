import java.util.Arrays;

class UsersArrayList implements UsersList {
	private User[]	users;
	private int		size;
	private static final int DEFAULT_CAPACITY = 10;

	UsersArrayList() {
		this.users = new User[DEFAULT_CAPACITY];
		this.size = 0;
	}

	private void	checkArraySize() {
		if (size == users.length) {
			int	newSize = users.length + (users.length >> 1);
			User[] newData = new User[newSize];
			for (int i = 0; i < users.length; i++) {
				newData[i] = users[i];
			}
			users = newData;
		}
	}

	@Override
	public void	addUser(User user) {
		checkArraySize();
		users[size++] = user;
	}

	@Override
	public User	getUserById(int userId) throws UserNotFoundException {
		for (User user : users) {
			if (user != null && user.getIdentifier() == userId) {
				return user;
			}
		}
		throw new UserNotFoundException("ERROR: User with ID: " + userId + ", doesn't exist!");
	}

	@Override
	public User	getUserByIndex(int index) throws IndexOutOfBoundsException {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("ERROR: Index " + index + " is out of bounds!");
		}
		return users[index];
	}

	@Override
	public int	getUserCount() {
		return size;
	}
}
