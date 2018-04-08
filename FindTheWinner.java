package main;

import java.util.Scanner;

public class FindTheWinner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = Integer.parseInt(scanner.nextLine());

		int[] andrea = new int[input];
		int[] maria = new int[input];

		for (int i = 0; i < input; i++) {
			andrea[i] = Integer.parseInt(scanner.nextLine());
		}
		
		int input1 = Integer.parseInt(scanner.nextLine());
		for (int i = 0; i < input1; i++) {
			maria[i] = Integer.parseInt(scanner.nextLine());
		}

		String flag = scanner.nextLine();
		scanner.close();
		System.out.println(winner(andrea, maria, flag));
	}

	static String winner(int[] andrea, int[] maria, String s) {
		int adreaPoints = 0;
		int mariaPoints = 0;

		if ("EVEN".equalsIgnoreCase(s)) {
			for (int i = 0; i < andrea.length; i++) {
				if (i % 2 == 0) {
					adreaPoints += andrea[i] - maria[i];
					mariaPoints += maria[i] - andrea[i];
				}
			}
		} else if ("ODD".equalsIgnoreCase(s)) {
			for (int i = 0; i < andrea.length; i++) {
				if (i % 2 == 1) {
					adreaPoints += andrea[i] - maria[i];
					mariaPoints += maria[i] - andrea[i];
				}
			}
		}
		System.out.println(adreaPoints + " "+ mariaPoints);
		if (adreaPoints > mariaPoints)
			return "Andrea";
		else
			return "Maria";

	}
}
