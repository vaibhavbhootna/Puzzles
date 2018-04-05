package main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PsychometricTesting {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int input = Integer.parseInt(scanner.nextLine());

		int[] scores = new int[input];
		for (int i = 0; i < input; i++) {
			scores[i] = Integer.parseInt(scanner.nextLine());
		}

		int lowerLimit = Integer.parseInt(scanner.nextLine());
		int lowerLimits[] = new int[lowerLimit];
		for (int i = 0; i < lowerLimit; i++) {
			lowerLimits[i] = Integer.parseInt(scanner.nextLine());
		}

		int upperLimit = Integer.parseInt(scanner.nextLine());
		int upperLimits[] = new int[lowerLimit];
		for (int i = 0; i < upperLimit; i++) {
			upperLimits[i] = Integer.parseInt(scanner.nextLine());
		}

		int[] result = jobOffers(scores, lowerLimits, upperLimits);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		scanner.close();
	}

	/*
	 * Complete the function below.
	 */
	static int[] jobOffers(int[] scores, int[] lowerLimits, int[] upperLimits) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < lowerLimits.length; i++) {
			int j = 0;
			int count = 0;
			while (j < scores.length) {
			//	System.out.println("Lower " + lowerLimits[i] + " Upper" + upperLimits[i] + " Scores " + scores[j]);
				if (lowerLimits[i] <= scores[j] && scores[j] <= upperLimits[i]) {
					count++;
				}
				j++;
			}
			list.add(count);
		}
		int[] jobOffers = new int[list.size()];
		for (int k = 0; k < list.size(); k++) {
			jobOffers[k] = list.get(k);
		}
		return jobOffers;
	}
}
