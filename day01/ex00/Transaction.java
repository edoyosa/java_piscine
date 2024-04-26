import java.util.UUID;
import java.io.*;

class	Transaction {
	UUID	identifier;
	User	recipient;
	User	sender;
	String	transferCategory;
	int		transferAmount;

	public Transaction(UUID identifier, User recipient, User sender, String transferCategory, int transferAmount) {
		if ((transferCategory.equals("credits") && transferAmount <= 0) || (transferCategory.equals("debits") && transferAmount >= 0)) {
			throw new IllegalArgumentException("ERROR: Invalid transfer amount!");
		}
		this.identifier = identifier;
		this.recipient = recipient;
		this.sender = sender;
		this.transferCategory = transferCategory;
		this.transferAmount = transferAmount;
	}

	UUID	getIdentifier() {
		return identifier;
	}

	User	getRecipient() {
		return recipient;
	}

	User	getSender() {
		return sender;
	}

	String	getTransferCategory() {
		return transferCategory;
	}

	int	getTransferAmount() {
		return transferAmount;
	}
}
