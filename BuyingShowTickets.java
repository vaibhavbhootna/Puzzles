package main;

import java.util.Scanner;

public class BuyingShowTickets {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = Integer.parseInt(scanner.nextLine());
		int[] tickets = new int[input];
		for (int i = 0; i < input; i++) {
			tickets[i] = Integer.parseInt(scanner.nextLine());
		}
		int pos = Integer.parseInt(scanner.nextLine());

		scanner.close();

		System.out.println("Wait : " + waitingTime(tickets, pos));
	}

	static long waitingTime(int[] tickets, int p) {
		int wait = 0;
		int i = 0;
		while (tickets[p] != 0) {
			if (tickets[i] > 0) {
				tickets[i] = tickets[i] - 1;
				wait++;
			}
			i++;
			if (i == tickets.length) {
				i = 0;
			}
		}
		return wait;
	}

}
