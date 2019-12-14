package codeforces;

import java.util.Scanner;

public class Team_231A {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int numberOfInputs=Integer.parseInt(scanner.nextLine());
		int count=0;
		for(int i=0;i<numberOfInputs;i++) {
			String input=scanner.nextLine();
			if(input.contains("1 1 0")||input.contains("0 1 1")||input.contains("1 0 1")||input.contains("1 1 1")) {
				count++;
			}
		}
		System.out.println(count);
	}

}
