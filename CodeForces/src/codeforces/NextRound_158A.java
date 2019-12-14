package codeforces;

import java.util.Scanner;

public class NextRound_158A {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String initialInput[]=scanner.nextLine().split("\\s");
		int numberOfInputs=Integer.parseInt(initialInput[0]);
		int indexOfPass=Integer.parseInt(initialInput[1]);
		String inputMarks[]=scanner.nextLine().split("\\s");
		int passMark=Integer.parseInt(inputMarks[indexOfPass-1]);
		int count=0;
		for(int i=0;i<numberOfInputs;i++) {
			if(Integer.parseInt(inputMarks[i])>=passMark && Integer.parseInt(inputMarks[i])!=0) {
				count++;
			}else {
				break;
			}
		}
		System.out.println(count);
	}

}
