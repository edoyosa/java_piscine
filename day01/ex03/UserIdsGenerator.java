class UserIdsGenerator {
	private static UserIdsGenerator instance;
	private int						lastId;

	private UserIdsGenerator() {
		this.lastId = 0;
	}

	public static synchronized UserIdsGenerator	getInstance() {
		if (instance == null) {
			instance = new UserIdsGenerator();
		}
		return instance;
	}

	public synchronized int	generateId() {
		return ++lastId;
	}
}
