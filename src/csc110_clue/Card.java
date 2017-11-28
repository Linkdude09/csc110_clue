package csc110_clue;

public class Card {
	
	String name;
	
	CardTypes type;
	
	boolean isSuspect;
	
	Card(String name, CardTypes type) {
		this.name = name;
		this.type = type;
		this.isSuspect = true;
	}

}
