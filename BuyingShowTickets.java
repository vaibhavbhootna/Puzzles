package main;

import java.util.Arrays;
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

	/*
	 * static long waitingTime(int[] tickets, int p) { int wait = 0; int i = 0;
	 * while (tickets[p] != 0) { if (tickets[i] > 0) { tickets[i] = tickets[i] - 1;
	 * wait++; } i++; if (i == tickets.length) { i = 0; } } return wait; }
	 */

	public static long waitingTime(int[] tickets, int p) {
		long waitTime = 0;
		int[] copyOfTkt = Arrays.copyOf(tickets, tickets.length);
		for (int i = 0; i < tickets.length; i++) {
			copyOfTkt[i] = tickets[i] - tickets[p];
		}
		for (int i = 0; i < tickets.length; i++) {
			if (copyOfTkt[i] < 0) {
				waitTime += tickets[i];
			} else {
				if (i <= p) {
					waitTime += tickets[p];
				} else {
					waitTime += tickets[p] - 1;
				}
			}
		}
		return waitTime;
	}

}
