package arr;

public class CopyElements {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int b[]=new int[a.length];
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
			System.out.println(b[i]);
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(b[i]);
		}
	}

}
/*
 * 1,2,3,4,5 b=a; a[0]=1 b[0]=1 a[1]=2 b[1]=2 a[2]=3 b[2]=3
 */