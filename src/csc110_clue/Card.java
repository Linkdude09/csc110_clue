package csc110_clue;

public class Card {

	private String name;

	private CardTypes type;

	private boolean isSuspect;

	Card(String name, CardTypes type) {
		this.name = name;
		this.type = type;
		this.isSuspect = true;
	}

	public String toString() {
		return this.name + "is a " + this.type + " Card.";
	}

	public CardTypes getType() {
		return type;
	}

	public String getName() {
		return name;
	}

	public boolean isSuspect() {
		return isSuspect;
	}

	public void setSuspect(boolean isSuspect) {
		if (!this.isSuspect) {
			throw new IllegalArgumentException(
					this.name + " is already exonerated, you cant reopen the case on them!!!");
		}
		this.isSuspect = isSuspect;
	}

}
