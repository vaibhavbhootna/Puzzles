package main;

import java.util.Scanner;

public class InTheFuture {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = Integer.parseInt(scanner.nextLine());
		int k = Integer.parseInt(scanner.nextLine());
		int p = Integer.parseInt(scanner.nextLine());
		scanner.close();
		System.out.println(minNum(a, k, p));

	}

	static int minNum(int a, int k, int p) {
		if (k < a) {
			return -1;
		} else {
			return k - a + p;
		}

	}
}
