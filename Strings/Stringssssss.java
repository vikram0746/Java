package Strings;

import java.util.Scanner;

public class Stringssssss {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int star=0,hash=0;
		for (int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='*') {
				star++;
			}
			else if(ch=='#') {
				hash++;
			}
		}
		if(star==hash) {
			System.out.println("Equal");
		}
		else if(star>hash) {
			System.out.println("positive");
		}
		else {
			System.out.println("Negative");
		}
		
	}

}
