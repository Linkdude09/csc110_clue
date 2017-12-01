package csc110_clue;

import java.util.ArrayList;

public class Game {

	ArrayList<Card> Deck = new ArrayList<>();

	private Card Suspect;
	private Card Weapon;
	private Card Room;

	Board b = new Board();

	public void Run() {

	}

	public void setup() {
		this.generateDeck();
		this.generateFile();
		b.initializeBoard(b.board);

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
		Deck.add(new Card("Wrench", CardTypes.Weapon));
		Deck.add(new Card("Candlestick", CardTypes.Weapon));
		Deck.add(new Card("Pistol", CardTypes.Weapon));
		Deck.add(new Card("Hallway", CardTypes.Room));
		Deck.add(new Card("Kicten", CardTypes.Room));
		Deck.add(new Card("BillardsRoom", CardTypes.Room));
		Deck.add(new Card("Ballroom", CardTypes.Room));
		Deck.add(new Card("Study", CardTypes.Room));
		Deck.add(new Card("Library", CardTypes.Room));
		Deck.add(new Card("Bedroom", CardTypes.Room));
		Deck.add(new Card("EntryHall", CardTypes.Room));
		

	}

	private void generateFile() {

	}

	public void movement() {

	}

}
