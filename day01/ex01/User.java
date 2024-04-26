class	User {
	private final int		identifier;
	private final String	name;
	int		balance;

	User(String name, int initialBalance) {
		if (initialBalance < 0)
			throw new IllegalArgumentException("ERROR: initial balance MUST be positive!");
		this.identifier = UserIdsGenerator.getInstance().generateId();
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
