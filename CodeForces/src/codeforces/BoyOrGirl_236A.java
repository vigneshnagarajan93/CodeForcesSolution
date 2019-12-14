package codeforces;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BoyOrGirl_236A {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String inputString[]=scanner.nextLine().split("");
		Set<String> setValue=new HashSet<>();
		for(String literal:inputString) {
			setValue.add(literal);
		}
		System.out.println(setValue.size()%2==0?"CHAT WITH HER!":"IGNORE HIM!");
	}

}
