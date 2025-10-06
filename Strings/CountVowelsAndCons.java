package Strings;

import java.util.Scanner;

public class CountVowelsAndCons {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String a=sc.nextLine();
		int vowels=0 , cons=0;
		for(int i=0;i<a.length();i++) {
			char c=a.charAt(i);
			if(c=='a'|| c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				vowels++;
			}
			else {
				cons++;
			}
		}
		System.out.println(vowels);
		System.out.println(cons);
	}

}
