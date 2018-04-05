package main;

import java.util.Scanner;

public class ConsecutiveSum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long num = Long.parseLong(scanner.nextLine());
		scanner.close();
		System.out.println(consecutive(num));
	}

	static long consecutive(long num) {
		long count = 0;

		for (long j = 2; j < num / 2; j++) {

			long temp = (j * (j + 1)) / 2;

			if (temp > num) {
				break;
			}

			if ((num - temp) % j == 0) {
				count++;
			}
		}

		return count;

	}
}
