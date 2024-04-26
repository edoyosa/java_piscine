import java.io.*;

class Program {
	public static void	main(String[] args) {
		User		u1;
		User		u2;

		u1 = new User("Edoardo", 44);
		u2 = new User("Eleonora", 444);
		System.out.println("User 1:");
		System.out.println("ID: " + u1.getIdentifier());
		System.out.println("Name: " + u1.getName());
		System.out.println("Balance: " + u1.getBalance() + "€");
		System.out.println("\nUser 2:");
		System.out.println("ID: " + u2.getIdentifier());
		System.out.println("Name: " + u2.getName());
		System.out.println("Balance: " + u2.getBalance() + "€");
		System.exit(0);
	}
}
