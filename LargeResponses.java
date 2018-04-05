package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Scanner;

public class LargeResponses {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		String fileName = scanner.nextLine();
		BufferedReader reader = new BufferedReader(new FileReader(fileName + ".txt"));
		String s = "";
		long bytes = 0;
		int count = 0;
		long temp;
		while ((s = reader.readLine()) != null) {
			temp = Long.parseLong(s.trim().substring(s.lastIndexOf(" ") + 1));
			if (temp > 5000) {
				bytes += temp;
				count++;
			}
		}
		scanner.close();
		reader.close();
		Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("bytes_" + fileName + ".txt")));
		writer.write(count + "\n" + bytes);
		writer.close();
	}

}
