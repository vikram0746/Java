package Strings;

import java.util.Scanner;

public class Concordinate {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		System.out.println("Enter first string:");
		String a=sc.nextLine();
		System.out.println("Enter second string:");
		String b=sc.nextLine();
		String concordinates="";
		for(int i=0;i<a.length();i++) {
			for (int j=0;j<b.length();j++) {
				concordinates+=a.charAt(i);
				concordinates+=b.charAt(j);
			}
		}
		System.out.println(concordinates);
		
	}
	
	

}
/*Write the program to concatenate the two strings with index.

Sample Input:
input1 = "apple"
input2 = "grape"

Sample Output:
agprpalpee (index of 0 of first string concatenate with index of 0 with string2)

Sample Input : 
Input 1 = “abc”
Input 2 = “p”
Output = “apbc”*/