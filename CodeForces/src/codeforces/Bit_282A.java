package codeforces;

import java.util.Scanner;

public class Bit_282A {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int numberOfInputs=Integer.parseInt(scanner.nextLine());
		int result=0;
		for(int i=0;i<numberOfInputs;i++) {
			String inputOperation=scanner.nextLine();
			if(inputOperation.contains("+")) {
				result++;
			}else {
				result--;
			}
		}
		System.out.println(result);
	}

}
