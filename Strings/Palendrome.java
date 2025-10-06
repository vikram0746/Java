package Strings;

import java.util.Scanner;

public class Palendrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the String:");
		String a=sc.nextLine();
		//a= a.replaceAll("\\s+", "").toLowerCase();
		String d="";
		for (int i=a.length()-1;i>=0;i--) {
			d+=a.charAt(i);
		}
		if(a.equals(d)) {
			System.out.println("Palendrome");
		}
		else {
			System.out.println("Not a palendrome");
		}
	}

}
