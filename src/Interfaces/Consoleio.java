package Interfaces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Consoleio {

	public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	public static int promptForMenuSelection(String[] options, boolean withQuit) throws IOException {
		int arrayLen = options.length;
		int input = 0;
		boolean validInput = false;
		String menuOptions = generateMenuOptions(options, withQuit);
		while (!validInput) {
			System.out.println("Here are your options, please enter the number representing your selection.");
			System.out.println(menuOptions);
			String rawInput = in.readLine();
			try {
				input = Integer.parseInt(rawInput);
				if (withQuit && input >= 0 && input <= (arrayLen + 1)) {
					validInput = true;
				} else if (!withQuit && input > 0 && input <= (arrayLen + 1)) {
					validInput = true;
				} else {
					System.out.println("Invalid Input, that number doesn't represent a valid option");
					validInput = false;
				}
			} catch (NumberFormatException ex) {
				System.out.println("Invalid Input: Enter the NUMBER that represents your selection, not the words");
			}
		}
		return input;
	}

	private static String generateMenuOptions(String[] options, boolean withQuit) {
		String returnString = "";
		for (int i = 0; i < options.length; i++) {
			returnString += "" + (i + 1) + "- " + options[i] + "\n";
		}
		if (withQuit) {
			returnString += "0- Quit";
		}
		return returnString;
	}

	public static boolean promptForBool(String prompt, String trueString, String falseString) throws IOException {
		boolean isInputValid = false;
		while (isInputValid == false) {
			System.out.println(prompt + " (" + trueString + " or " + falseString + ")");
			String input = in.readLine();
			if (input.equalsIgnoreCase(trueString)) {
				isInputValid = true;
				return true;
			} else if (input.equalsIgnoreCase(falseString)) {
				isInputValid = true;
				return false;
			} else {
				isInputValid = false;
				System.out.println("That is not a valid input, please try again");
			}
		}
		return false;

	}

	public static byte promptForByte(String prompt, byte min, byte max) throws IOException {
		boolean validInput = false;
		byte input = 0;
		while (validInput == false) {
			System.out.println(prompt);
			String rawInput = in.readLine();
			try {
				input = Byte.parseByte(rawInput);

				if (input >= min && input <= max) {
					validInput = true;
				} else {
					validInput = false;
					System.out.println(
							"Try Again: You entered a value that doesn't fall within " + min + "-" + max + ".");
				}
			} catch (NumberFormatException ex) {
				validInput = false;
				System.out.println("Invalid Input: Try typing a number");
			}
		}
		return input;
	}

	public static short promptForShort(String prompt, short min, short max) throws IOException {
		boolean validInput = false;
		short input = 0;
		while (validInput == false) {
			System.out.println(prompt);
			String rawInput = in.readLine();
			try {
				input = Short.parseShort(rawInput);

				if (input > min && input <= max) {
					validInput = true;
				} else {
					validInput = false;
					System.out
							.println("Try Again You entered a value that doesn't fall within " + min + "-" + max + ".");
				}
			} catch (NumberFormatException ex) {
				validInput = false;
				System.out.println("Invalid Input: Try typing a number");
			}
		}
		return input;
	}

	public static int promptForInt(String prompt, int min, int max) throws IOException {
		boolean validInput = false;
		int input = 0;
		while (validInput == false) {
			System.out.println(prompt);
			String rawInput = in.readLine();
			try {
				input = Integer.parseInt(rawInput);

				if (input >= min && input <= max) {
					validInput = true;
				} else {
					validInput = false;
					System.out
							.println("Try Again You entered a value that doesn't fall within " + min + "-" + max + ".");
				}
			} catch (NumberFormatException ex) {
				validInput = false;
				System.out.println("Invalid Input: Try typing a number");
			}
		}
		return input;
	}

	public static long promptForLong(String prompt, long min, long max) throws IOException {
		boolean validInput = false;
		long input = 0;
		while (validInput == false) {
			System.out.println(prompt);
			String rawInput = in.readLine();
			try {
				input = Long.parseLong(rawInput);

				if (input >= min && input <= max) {
					validInput = true;
				} else {
					validInput = false;
					System.out
							.println("Try Again You entered a value that doesn't fall within " + min + "-" + max + ".");
				}
			} catch (NumberFormatException ex) {
				validInput = false;
				System.out.println("Invalid Input: Try typing a number");
			}
		}
		return input;
	}

	public static float promptForFloat(String prompt, float min, float max) throws IOException {
		boolean validInput = false;
		float input = 0;
		while (validInput == false) {
			System.out.println(prompt);
			String rawInput = in.readLine();
			try {
				input = Float.parseFloat(rawInput);

				if (input >= min && input <= max) {
					validInput = true;
				} else {
					validInput = false;
					System.out
							.println("Try Again You entered a value that doesn't fall within " + min + "-" + max + ".");
				}
			} catch (NumberFormatException ex) {
				validInput = false;
				System.out.println("Invalid Input: Try typing a number");
			}
		}
		return input;
	}

	public static double promptForDouble(String prompt, double min, double max) throws IOException {
		boolean validInput = false;
		double input = 0;
		while (validInput == false) {
			System.out.println(prompt);
			String rawInput = in.readLine();
			try {
				input = Double.parseDouble(rawInput);

				if (input >= min && input <= max) {
					validInput = true;
				} else {
					validInput = false;
					System.out
							.println("Try Again You entered a value that doesn't fall within " + min + "-" + max + ".");
				}
			} catch (NumberFormatException ex) {
				validInput = false;
				System.out.println("Invalid Input: Try typing a number");
			}
		}
		return input;
	}

	public static String promptForInput(String prompt, boolean allowEmpty) throws IOException {
		String input = "";
		System.out.println(prompt);
		if (allowEmpty) {
			input = in.readLine();
		} else {
			do {
				input = in.readLine();
				if (input.length() == 0 || input.equals(null)) {
					System.out.println("You can;t enter an empty String, Try Again.");
				}
			} while (input.length() == 0 || input.equals(null));
		}
		return input;
	}

	public static char promptForChar(String prompt, char min, char max) throws IOException {
		boolean validInput = false;
		char input = 0;
		String rawInput;
		while (validInput == false) {
			System.out.println(prompt);
			rawInput = in.readLine();
			if (rawInput.length() == 1) {
				input = rawInput.charAt(0);
				if (input >= min && input <= max) {
					validInput = true;
				} else {
					System.out.println("That char doesn't fall within the parameters");
					validInput = false;
				}
			} else {
				System.out.println("a char is a single letter, not an absense of them or a plurality of them, ONE!!!");
				validInput = false;
			}
		}
		return input;
	}
}
