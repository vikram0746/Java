package arr;

import java.util.Scanner;

public class RemoveDuplicateElements {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		int a[]=new int[s];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
            boolean isduplicate = false;
            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    isduplicate = true;
                    break;
                }
            }
            if (!isduplicate) {
                System.out.println(a[i]);
            }
        }
    }
	
	}


