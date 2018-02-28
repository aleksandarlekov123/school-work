package Zad3;

import java.util.Arrays;
import java.util.Scanner;

public class Handman {

	public static final int MAX_TRIES = 10;

	private static String word = "circle";

	private static String[] words = {
     "circle", "library", "bycicle"
	};
	private static int tries = MAX_TRIES;

	private static boolean guessed = false; //

	private static Scanner sc = new Scanner(System.in);

	private static char[] chars = new char[word.length()];

	public static void main(String[] args) {

		Arrays.fill(chars, '*');

		do {
			System.out.println("Guess a letter : ");

			String guessStr = sc.nextLine();
			char ch = guessStr.charAt(0);

			for (int i = 0; i < chars.length; i++) {
				if (word.charAt(i) == ch)
					chars[i] = ch;

			}

			System.out.println(new String(chars));

			if (new String(chars).equals(word)) {
				guessed = true;
			}
			System.out.println("You have this number of tries more : " + --tries);
		} while (!guessed && tries > 0);
	}

}
