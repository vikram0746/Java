package Strings;

import java.util.Scanner;

public class ReverseAString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String a=sc.nextLine();
		String reversed="";
		for(int i=a.length()-1;i>=0;i--) {
			reversed+=a.charAt(i);
		}
		System.out.println(reversed);
	}

}
