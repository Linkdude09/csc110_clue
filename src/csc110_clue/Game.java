package csc110_clue;

import java.util.ArrayList;

public class Game {

	ArrayList<Card> Deck = new ArrayList<>();

	public void Run() {

	}

	public void setup() {
		this.generateDeck();
		this.generateFile();

	}

	private void generateDeck() {
		Deck.add(new Card("Professor Plum", CardTypes.Suspect));
		Deck.add(new Card("Mr. Green", CardTypes.Suspect));
		Deck.add(new Card("Col. Mustard", CardTypes.Suspect));
		Deck.add(new Card("Ms. Scarlet", CardTypes.Suspect));
		Deck.add(new Card("Mrs. White", CardTypes.Suspect));
		Deck.add(new Card("Mrs. Peacock", CardTypes.Suspect));
		Deck.add(new Card("Rope", CardTypes.Weapon));
		Deck.add(new Card("Leadpipe", CardTypes.Weapon));
		Deck.add(new Card("Knife", CardTypes.Weapon));
	}

	private void generateFile() {

	}
	
	public void movement() {
		
	}

}
