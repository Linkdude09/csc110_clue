package csc110_clue;

import java.io.IOException;
import java.util.ArrayList;

public class ClueGame {

	public static void main(String[] args) {
		Game g = new Game();
		Board b = new Board();
		b.board = new Square[b.BOARD_LENGTH][b.BOARD_WIDTH];
		g.setup();
		g.Run();
		

	}
	

}

