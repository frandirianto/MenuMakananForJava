package main;

import java.util.Scanner;

public class Main {

	public static Scanner scan;

	public Main() {
		scan = new Scanner(System.in);	
		new FoodMenu();
	}

	public static int ScanInteger() {
		int number = -1;
		try {
			number = scan.nextInt();
		} catch (Exception e) {
			System.out.println("Input harus angka");
			number = -1;
		}
		scan.nextLine();
		return number;
	}
	
	public static char ScanCharacter() {
		char character = 'a';
		character = scan.nextLine().charAt(0);
		return character;
	}

	public static void main(String[] args) {
		new Main();
	}
}
