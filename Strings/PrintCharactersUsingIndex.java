package Strings;
import java.util.Scanner;
import java.util.*;
public class PrintCharactersUsingIndex {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int s[]=new int[a];
	for(int i=0;i<s.length;i++) {
		s[i]=sc.nextInt();
	}
	System.out.println("Where the element to be stored: ");
	int b=sc.nextInt();
	System.out.println("Enter the element: ");
	int c=sc.nextInt();
	int v[]=new int[a+1];
	for(int i=0;i<b;i++) {
		v[i]=s[i];
	}
	v[b]=c;
	for(int i=b;i<v.length;i++) {
			v[i+1]=s[i];
	}
	for(int i=0;i<v.length;i++) {
		System.out.println(v[i]);
	}
	}
	
}
