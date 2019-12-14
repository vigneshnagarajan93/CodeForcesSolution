package codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Helpful_Maths_339A {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String input=scanner.nextLine();
		String splitString[]=input.split("\\+");
		int[] inputArr=new int[splitString.length];
		for(int i=0;i<splitString.length;i++) {
			inputArr[i]=Integer.parseInt(splitString[i]);
		}
		Arrays.sort(inputArr);
		StringBuilder stringBuilder=new StringBuilder();
		for(int i=0;i<inputArr.length;i++) {
			if(i!=inputArr.length-1) {
			stringBuilder.append(Integer.toString(inputArr[i])+"+");
			
			  }else { stringBuilder.append(Integer.toString(inputArr[i])); }
			 
		}
		System.out.println(stringBuilder.toString());
	}

}
