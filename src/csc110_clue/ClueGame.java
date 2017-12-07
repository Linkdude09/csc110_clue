package csc110_clue;

import java.io.IOException;
import Interfaces.Consoleio;

public class ClueGame {

	public static void main(String[] args) throws IOException {
		boolean willReplay = true;
		while (willReplay) {
			Game g = new Game();
			g.setup();
			g.Run();
			willReplay = Consoleio.promptForBool("Would you like to play again?", "Yes", "No");
		}

	}

}
