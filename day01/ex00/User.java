import java.io.*;

class	User {
	int		identifier;
	String	name;
	int		balance;

	User(int identifier, String name, int initialBalance) {
		if (initialBalance < 0) {
			System.out.println("ERROR: initial balance MUST be positive!");
			System.exit(1);
		}
		this.identifier = identifier;
		this.name = name;
		this.balance = initialBalance;
	}

	int	getIdentifier() {
		return identifier;
	}

	String	getName() {
		return name;
	}

	int	getBalance() {
		return balance;
	}
}
