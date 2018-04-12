package main;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class BalancedorNot {
	/*
	 * Complete the function below.
	 */
	static int[] balancedOrNot(String[] expressions, int[] maxReplacements) {
		int[] result = new int[expressions.length];
		for (int i = 0; i < expressions.length; i++) {
			int less = 0;
			int greater = 0;
			char s[] = expressions[i].toCharArray();
			for (int pos = 0; pos < s.length; pos++) {
				if (s[pos] == '<') {
					less++;
				} else {
					if (less == 0) {
						less = 1;
						break;
					} else {
						greater++;
					}
				}

			}
			if (less == greater) {
				result[i] = 1;
			} else {
				if (less > greater) {
					result[i] = 0;
				} else if (greater - less <= maxReplacements[i]) {
					result[i] = 1;
				} else {
					result[i] = 0;
				}
			}

		}
		return result;
	}

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int input = Integer.parseInt(scanner.nextLine());
		String[] expressions = new String[input];
		for (int i = 0; i < input; i++) {
			expressions[i] = scanner.nextLine();
		}
		int input1 = Integer.parseInt(scanner.nextLine());
		int[] maxReplacements = new int[input1];
		for (int i = 0; i < input1; i++) {
			maxReplacements[i] = Integer.parseInt(scanner.nextLine());
		}
		scanner.close();
	}
}