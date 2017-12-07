package csc110_clue;

import java.util.ArrayList;

public class Player {

	public String name;

	public ArrayList<Card> PlayerHand = new ArrayList<>();

	public String handToString() {
		String RS = "Note: If you have a card then you know that the info that card presents is innocentin the crime \n";
		RS += "You have the Following cards: \n";
		for (int i = 0; i < PlayerHand.size(); i++) {
			RS += PlayerHand.get(i).toString() + "\n";
		}
		return RS;
	}

}
