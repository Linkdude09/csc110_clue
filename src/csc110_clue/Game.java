package csc110_clue;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import Interfaces.Consoleio;

public class Game {

	public ArrayList<Card> Deck = new ArrayList<>();

	private Card Suspect;
	private Card Weapon;
	private Card Room;

	boolean isGameWon = false;

	Player[] players;

	public Random gen = new Random();

	public void Run() throws IOException {
		System.out.println("The Body has been found and you must find the murdurer, lest you die as well.");
		while (!isGameWon) {
			int nullcount = 0;
			for (int i = 0; i < players.length; i++) {
				if (players[i] == null) {
					nullcount++;
				} else {
					players[i] = takeTurn(players[i], i + 1);
				}
				if (isGameWon) {
					break;
				}
			}
			if(nullcount == players.length) {
				System.out.println("The game is over as all the investigators have been incarcerated, and the murderer has gotten away");
				break;
			}
		}
		System.out.println("Thank you so much for playing my game!!!");
	}

	public Player takeTurn(Player turnPlayer, int i) throws IOException {
		System.out.println("It is now " + turnPlayer.name + "'s turn");
		System.out.println(turnPlayer.handToString());
		int menuSel = Consoleio.promptForMenuSelection(new String[] { "Make suggestion", "Make Accusation", "Pass" },
				false);
		switch (menuSel) {
		case 1:
			turnPlayer = makeSuggestion(turnPlayer);
			break;
		case 2:
			turnPlayer = makeAccusation(turnPlayer);
			break;
		case 3:
			System.out.println(turnPlayer.name + " has passed their turn and will not do anything this round.");
			break;
		default:
			throw new IllegalArgumentException("Didn't expect menuSel to have this val: " + menuSel);
		}
		return turnPlayer;
	}

	private Player makeAccusation(Player turnPlayer) throws IOException {
		String guessSus = Consoleio.promptForInput("Who do you think did it? (Spelling matters)", false);
		String guessWeap = Consoleio.promptForInput("What Weapon do you think they used? (Spelling Matters)", false);
		String guessRoom = Consoleio.promptForInput("What room do you think the crime happened in? (Spelling Matters)",
				false);
		if (guessSus.equalsIgnoreCase(this.Suspect.getName()) && guessWeap.equalsIgnoreCase(this.Weapon.getName())
				&& guessRoom.equalsIgnoreCase(this.Room.getName())) {
			this.isGameWon = true;
			System.out.println(
					turnPlayer.name + " has correctly solved the mystery, with thier brilliant deduction that");
			System.out.println(guessSus + " used the " + guessWeap + " in the " + guessRoom + " to commit the murder.");
			System.out.println("Thanks to your valient efforts " + turnPlayer.name
					+ ", this heinous criminal will never again sully our fair streets and/or mansions");
		} else {
			System.out.println("You have wrong accused an innocent " + turnPlayer.name
					+ ", and this affront to human decency you have been incarcerated");
			System.out.println("and can no longer solve the mystery.");
		}

		return turnPlayer;
	}

	private Player makeSuggestion(Player turnPlayer) throws IOException {
		String guessSus = Consoleio.promptForInput("Who do you think did it? (Spelling matters)", false);
		String guessWeap = Consoleio.promptForInput("What Weapon do you think they used? (Spelling Matters)", false);
		String guessRoom = Consoleio.promptForInput("What room do you think the crime happened in? (Spelling Matters)",
				false);
		for (int i = 0; i < players.length; i++) {
			for (int j = 0; j < players[i].PlayerHand.size(); j++) {
				if (guessSus.equalsIgnoreCase(players[i].PlayerHand.get(j).getName())
						|| guessWeap.equalsIgnoreCase(players[i].PlayerHand.get(j).getName())
						|| guessRoom.equalsIgnoreCase(players[i].PlayerHand.get(j).getName())) {
					System.out.println(turnPlayer.name + ", " + players[i].name
							+ " Can prove you wrong with the following: " + players[i].PlayerHand.get(j).toString());
					turnPlayer.PlayerHand.add(players[i].PlayerHand.get(j));
				}
			}
		}
		return turnPlayer;
	}

	public void setup() throws IOException {
		this.generateDeck();
		this.generateFile();
		this.generatePlayerHands();

	}

	private void generatePlayerHands() throws IOException {
		int playerTotal = Consoleio.promptForInt("How many players are playing?", 2, 6);
		players = new Player[playerTotal];
		for (int i = 0; i < players.length; i++) {
			players[i] = new Player();
			players[i].name = Consoleio.promptForInput("Player " + (i + 1) + ", What is your name?", true);
		}
		int x = 0;
		for (int i = 0; i < Deck.size(); i++) {
			players[x].PlayerHand.add(Deck.get(i));
			if (x == players.length - 1) {
				x = 0;
			} else {
				x++;
			}
		}

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
		int index = this.gen.nextInt(9) + 12;
		Room = Deck.get(index);
		Deck.remove(index);
		index = this.gen.nextInt(6) + 6;
		Weapon = Deck.get(index);
		Deck.remove(index);
		index = this.gen.nextInt(6);
		Suspect = Deck.get(index);
		Deck.remove(index);
	}

}
