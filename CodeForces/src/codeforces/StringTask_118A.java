package codeforces;

import java.util.Scanner;

public class StringTask_118A {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String inputString=scanner.nextLine();
		StringBuilder resultBuilder=new StringBuilder();
		for(char literal:inputString.toLowerCase().replaceAll("(a|o|y|e|u|i)", "").toCharArray()) {
			resultBuilder.append("."+literal);
		}
		System.out.println(resultBuilder.toString());
	}

}
