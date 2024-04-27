class	User {
	private final int				identifier;
	private final String			name;
	int								balance;
	private final TransactionList	transactions;

	User(String name, int initialBalance) {
		if (initialBalance < 0) {
			System.out.println("ERROR: initial balance MUST be positive!");
			System.exit(1);
		}
		this.identifier = UserIdsGenerator.getInstance().generateId();
		this.name = name;
		this.balance = initialBalance;
		this.transactions = new TransactionLinkedList();
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
