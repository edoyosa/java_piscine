import java.io.*;
import java.util.UUID;

class Program {
	public static void	main(String[] args) {
		User		u1;
		User		u2;
		Transaction	t1;
		Transaction	t2;

		u1 = new User(1, "Edoardo", 44);
		u2 = new User(2, "Eleonora", 444);
		System.out.println("User 1:");
		System.out.println("ID: " + u1.getIdentifier());
		System.out.println("Name: " + u1.getName());
		System.out.println("Balance: " + u1.getBalance() + "€");
		System.out.println("\nUser 2:");
		System.out.println("ID: " + u2.getIdentifier());
		System.out.println("Name: " + u2.getName());
		System.out.println("Balance: " + u2.getBalance() + "€");
		t1 = new Transaction(UUID.randomUUID(), u1, u2, "debits", -10);
		t2 = new Transaction(UUID.randomUUID(), u2, u1, "credits", 66);
		System.out.println("\nTransaction 1:");
		System.out.println("ID: " + t1.getIdentifier());
		System.out.println("Sender: " + t1.getSender().getName());
		System.out.println("Recipient: " + t1.getRecipient().getName());
		System.out.println("Transfer category: " + t1.getTransferCategory());
		System.out.println("Transfer amount: " + t1.getTransferAmount() + "€");
		System.out.println("\nTransaction 2:");
		System.out.println("ID: " + t2.getIdentifier());
		System.out.println("Sender: " + t2.getSender().getName());
		System.out.println("Recipient: " + t2.getRecipient().getName());
		System.out.println("Transfer category: " + t2.getTransferCategory());
		System.out.println("Transfer amount: " + t2.getTransferAmount() + "€");
		System.exit(0);
	}
}
