package codeforces;

import java.util.Scanner;

public class WordCaptialization_281A {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String inputString=scanner.nextLine();
		char toBeReplaced=inputString.charAt(0);
		System.out.println(inputString.replaceAll("^[a-z]", Character.toString(toBeReplaced).toUpperCase()));
	}

}
