package codeforces;

import java.util.Scanner;

public class Football_96A {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String input=scanner.nextLine();
		System.out.println((input.contains("0000000")||input.contains("1111111")) ?"YES":"NO");
	}

}
