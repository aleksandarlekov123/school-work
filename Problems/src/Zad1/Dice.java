package Zad1;

import java.util.Random;

public class Dice {

	public static void main(String[] args) {
		Random rand = new Random();
		int throw1 = rand.nextInt(6) + 1;
		int throw2 = rand.nextInt(6) + 1;

		System.out.println("I zarche : " + throw1);
		System.out.println("II zarche : " + throw2);

		if (throw1 == throw2) {
			System.out.println("ednakvi");

		} else if (throw1 > throw2)
			System.out.println("I zar e po-golqm ot II");

		else
			System.out.println("II zar e po-golqm");
	}

}
