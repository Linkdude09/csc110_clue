package csc110_clue;

import java.io.IOException;

import Interfaces.Consoleio;

public class ClueGame {
	
	int NumofPlayer = 0;

	public static void main(String[] args) {
		
		

	}
	
	public void setup() throws IOException {
		NumofPlayer = Consoleio.promptForInt("How many people are playing?", 2, 6);
		
	}

}

