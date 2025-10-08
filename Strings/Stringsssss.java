package Strings;

import java.util.Scanner;

public class Stringsssss {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char v[]=s.toCharArray();
		String st="",ha="";
		for(int i=0;i<v.length;i++) {
			if(v[i]==35) {
				ha=ha+v[i];
			}
			else if(v[i]==42) {
				st=st+v[i];
			}
		}
		if (ha.length()==st.length()) {
			System.out.println("Number of * and # are equal");
		}
		else if(ha.length()>=st.length()) {
			System.out.println("positive integer");
		}
		else {
			System.out.println("Negative Integetr");
		}
		
		
		
		
		
		
	}
	
	

}
//Given a string S(input consisting) of ‘*’ and ‘#’. The length of the string is variable. The task is to find the minimum number of ‘*’ or ‘#’ to make it a valid string. The string is considered valid if the number of ‘*’ and ‘#’ are equal. The ‘*’ and ‘#’ can be at any position in the string.
//Note : The output will be a positive or negative integer based on number of ‘*’ and ‘#’ in the input string.
//(*>#): positive integer
//(#>*): negative integer
//(#=*): 0
//Sample Input:
//###*** -> Value of S
//Sample Output :
//→ number of * and # are equal
//Sample Input :
//##**** -> Value of S
//Sample Output :
//1