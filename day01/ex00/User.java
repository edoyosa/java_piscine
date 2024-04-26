import java.io.*;

class	User {
	int		identifier;
	String	name;
	int		balance;

	User(int identifier, String name, int initialBalance) {
		if (initialBalance < 0)
			throw new IllegalArgumentException("ERROR: initial balance MUST be positive!");
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
