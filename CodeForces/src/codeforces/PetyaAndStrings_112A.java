package codeforces;

import java.util.Scanner;

public class PetyaAndStrings_112A {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String input1=scanner.nextLine();
		String input2=scanner.nextLine();
		int string1CharLength=0;
		int string2CharLength=0;
		
		for(char literal:input1.toLowerCase().toCharArray()) {
			string1CharLength+=(int)(literal);
		}
		for(char literal:input2.toLowerCase().toCharArray()) {
			string2CharLength+=(int)(literal);
		}
		if(string1CharLength==string2CharLength) {
			System.out.println("0");
		}else if(string1CharLength<string2CharLength) {
			System.out.println("-1");
		}else {
			System.out.println("1");
		}
	}

}
