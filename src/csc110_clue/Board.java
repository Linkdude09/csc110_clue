package csc110_clue;

public class Board {
	
	private final static int BOARD_LENGTH = 25;
	private final static int BOARD_WIDTH = 24;
	
	
	public static void main(String[] args) {
		
		Square[][] board = null;
		initializeBoard(board);

	}

	public static Square[][] initializeBoard(Square[][] input) {
		input = new Square[BOARD_LENGTH][BOARD_WIDTH];
		input = startBoard(input);
		input = setStudy(input);
		input = setHall(input);
		input = setLounge(input);
		input = setDining(input);
		input = setKitchen(input);
		input = setBallroom(input);
		input = setConservatory(input);
		input = setBilliards(input);
		input = setLibrary(input);
		input = setMiddle(input);
		input = setPLayers(input);
		for(int i = 0; i < 25; i++) {
			for(int j = 0; j < 24; j++) {
				System.out.print(input[i][j] + " ");
			}
			System.out.println();
		}
		return input;
		
	}

	private static Square[][] setPLayers(Square[][] players) {
		players[0][16] = Square.s;
		players[7][23] = Square.m;
		players[5][0] = Square.p;
		players[24][14] = Square.w;
		players[24][9] = Square.g;
		players[18][0] = Square.P;
		return players;
	}

	private static Square[][] setMiddle(Square[][] mid) {
		for(int i = 8; i < 15; i++) {
			for(int j = 9; j < 14; j++) {
				mid[i][j] = Square.X;
			}
		}
		return mid;
	}

	private static Square[][] setLibrary(Square[][] library) {
		for(int i = 0; i < 6; i++) {
			library[6][i] = Square.X;
		}
		library[7][5] = Square.X;
		for(int i = 7; i < 10; i++) {
			library[i][6] = Square.X;
		}
		library[9][5] = Square.X;
		for(int i = 0; i < 6; i++) {
			library[10][i] = Square.X;
		}
		for(int i = 7; i < 10; i++) {
			library[i][0] = Square.X;
		}
		for(int i = 7; i < 10; i++) {
			for(int j = 1; j < 5; j++) {
				library[i][j] = Square.l;
			}
		}
		library[8][5] = Square.l;
		library[8][6] = Square.d;
		library[10][3] = Square.d;
		return library;
	}

	private static Square[][] setBilliards(Square[][] bill) {
		for(int i = 0; i < 6; i++) {
			bill[12][i] = Square.X;
		}
		for(int i = 12; i < 17; i++) {
			bill[i][5] = Square.X;
		}
		for(int i = 11; i < 18; i++) {
			bill[i][0] = Square.X;
		}
		for(int i = 1; i < 6; i++) {
			bill[16][i] = Square.X;
		}
		for(int i = 13; i < 16; i++) {
			for(int j = 1; j < 5; j++) {
				bill[i][j] = Square.B;
			}
		}
		bill[12][1] = Square.d;
		bill[15][5] = Square.d;
		return bill;
	}

	private static Square[][] setConservatory(Square[][] cons) {
		for(int i = 0; i < 6; i++) {
			cons[19][i] = Square.X;
		}
		for(int i = 20; i < 25; i++) {
			cons[i][5] = Square.X;
		}
		for(int i = 20; i < 25; i++) {
			cons[i][0] = Square.X;
		}
		for(int i = 1; i < 7; i++) {
			cons[23][i] = Square.X;
		}
		for(int i = 1; i < 9; i++) {
			cons[24][i] = Square.X;
		}
		for(int i = 20; i < 23; i++) {
			for(int j = 1; j < 5; j++) {
				cons[i][j] = Square.C;
			}
		}
		cons[19][4] = Square.d;
		return cons;
	}

	private static Square[][] setBallroom(Square[][] ballroom) {
		for(int i = 8; i < 16; i++) {
			ballroom[17][i] = Square.X;
		}
		for(int i = 17; i < 23; i ++) {
			ballroom[i][15] = Square.X;
		}
		for(int i = 17; i < 23; i++) {
			ballroom[i][8] = Square.X;
		}
		for(int i = 8; i < 16; i++) {
			ballroom[22][i] = Square.X;
		}
		for(int i = 23; i < 25; i++) {
			for(int j = 10; j < 14; j++) {
				ballroom[i][j] = Square.X;
			}
		}
		for(int i = 18; i < 22; i++) {
			for(int j = 9; j < 15; j++) {
				ballroom[i][j] = Square.b;
			}
		}
		for(int i = 11; i < 13; i++) {
			for(int j = 22; j < 24; j++) {
				ballroom[j][i] = Square.b;
			}
		}
		ballroom[19][8] = Square.d;
		ballroom[19][15] = Square.d;
		ballroom[17][9] = Square.d;
		ballroom[17][14] = Square.d;
		return ballroom;
	}

	private static Square[][] setKitchen(Square[][] kitchen) {
		for(int i = 18; i < 24; i++) {
			kitchen[18][i] = Square.X;
		}
		for(int i = 18; i < 25; i++) {
			kitchen[i][18] = Square.X;
		}
		for(int i = 15; i < 24; i++) {
			kitchen[24][i] = Square.X;
		}
		for(int i = 17; i < 24; i++) {
			kitchen[23][i] = Square.X;
		}
		for(int i = 19; i < 23; i++) {
			kitchen[i][23] = Square.X;
		}
		for(int i = 19; i < 23; i++) {
			for(int j = 19; j < 23; j++) {
				kitchen[i][j] = Square.K;
			}
		}
		kitchen[18][19] = Square.d;
		return kitchen;
	}

	private static Square[][] setDining(Square[][] dining) {
		for(int i = 16; i < 24; i++) {
			dining[9][i] = Square.X;
		}
		for(int i = 9; i < 15; i++) {
			dining[i][16] = Square.X;
		}
		for(int i = 16; i < 20; i++) {
			dining[14][i] = Square.X;
		}
		for(int i = 19; i < 24; i++) {
			dining[15][i] = Square.X;
		}
		for(int i = 8; i < 17; i++) {
			dining[i][23] = Square.X;
		}
		for(int i = 10; i < 14; i++) {
			for(int j = 17; j < 23; j++) {
				dining[i][j] = Square.D;
			}
		}
		for(int i = 20; i < 23; i++) {
			dining[14][i] = Square.D;
		}
		dining[9][17] = Square.d;
		dining[12][16] = Square.d;
		return dining;
	}

	private static Square[][] setLounge(Square[][] lounge) {
		for(int i = 0; i < 6; i++) {
			lounge[i][17] = Square.X;
		}
		for(int i = 17; i < 24; i++) {
			lounge[0][i] = Square.X;
		}
		for(int i = 17; i < 24; i++) {
			lounge[5][i] = Square.X;
		}
		for(int i = 0; i < 7; i++) {
			lounge[i][23] = Square.X;
		}
		for(int i = 1; i < 5; i++) {
			for(int j = 18; j < 23; j++) {
				lounge[i][j] = Square.L;
			}
		}
		lounge[5][18] = Square.d;
		return lounge;
	}

	private static Square[][] setHall(Square[][] hall) {
		for(int i = 8; i < 16; i++) {
			hall[0][i] = Square.X;
		}
		for(int i = 0; i < 7; i++) {
			hall[i][9] = Square.X;
		}
		for(int i = 9; i < 15; i++) {
			hall[6][i] = Square.X;
		}
		for(int i = 1; i < 7; i++) {
			hall[i][14] = Square.X;
		}
		for(int i = 1; i < 6; i++) {
			for(int j = 10; j < 14; j++) {
				hall[i][j] = Square.H;
			}
		}
		hall[6][11] = Square.d;
		hall[6][12] = Square.d;
		return hall;
	}

	private static Square[][] startBoard(Square[][] input) {
		for(int i = 0; i< 25; i++) {
			for(int j = 0; j < 24; j++) {
				input[i][j] = Square.O;
			}
		}
		return input;
	}

	private static Square[][] setStudy(Square[][] study) {
		for(int i = 0; i < 7; i++) {
			study[0][i] = Square.X;
		}
		for(int i = 0; i < 5; i++) {
			study[i][0] = Square.X;
		}
		for(int i = 0; i < 7; i++) {
			study[3][i] = Square.X;
		}
		for(int i = 0; i < 4; i++) {
			study[i][6] = Square.X;
		}
		for(int i = 1; i < 3; i++) {
			for(int j = 1; j < 6; j++) {
				study[i][j] = Square.S;
			}
		}
		study[3][5] = Square.d;

		return study;
	}

}
