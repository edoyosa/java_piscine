public interface TransactionList {
	void	addTransaction(Transaction transaction);
	void	removeTransactionById(String transactionId);
	Transaction[] toArray();
}
