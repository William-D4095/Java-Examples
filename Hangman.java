package test;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;

public class Hangman {
	public static void main(String[] args) {
		String fileName = "/Users/william/Downloads/Random.txt";
		int n = 0;
		ArrayList<String> x = new ArrayList<String>();
		try {
			Scanner sc = new Scanner(new File(fileName));
			while (sc.hasNextLine()) {
				String word = sc.nextLine();
				System.out.println(word);
				n++;
				//ArrayList
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println(n);
		Random rand = new Random();
		int n1 = rand.nextInt(n);
		System.out.println(n1);
	}
}
//write something to count total number of word in file
