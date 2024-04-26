import java.io.*;

class Program {
	public static void	main(String[] args) {
		UsersArrayList userList = new UsersArrayList();

		userList.addUser(new User("Edoardo", 44));
		userList.addUser(new User("Eleonora", 444));
		try {
			User userById = userList.getUserById(2);
			System.out.println("User with ID: " + userById.getIdentifier());
			System.out.println("Name: " + userById.getName());
			System.out.println("Balance: " + userById.getBalance() + "€");
		} catch (UserNotFoundException e) {
			System.out.println(e.getMessage());
		}
		try {
			User userByIndex = userList.getUserByIndex(0);
			System.out.println("\nUser with ID: " + userByIndex.getIdentifier());
			System.out.println("Name: " + userByIndex.getName());
			System.out.println("Balance: " + userByIndex.getBalance() + "€");
		} catch (IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("\nTotal number of users: " + userList.getUserCount());
		System.exit(0);
	}
}
