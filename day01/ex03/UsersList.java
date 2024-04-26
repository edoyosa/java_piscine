public interface UsersList {
	void	addUser(User user);
	User	getUserById(int userId) throws UserNotFoundException;
	User	getUserByIndex(int index) throws IndexOutOfBoundsException;
	int		getUserCount();
}
