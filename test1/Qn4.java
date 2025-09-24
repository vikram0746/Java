package test1;

public class Qn4 {
	public static void main(String[] args) {
		int row=5;
		int sp=row-1;
		for(int i=1;i<=row;i++)
		{
			for(int k=sp;k>=1;k--)
			{
				System.out.print(" ");
			}
			sp=sp-1;
			for(int j=0;j<i;j++)
			{
				System.out.print(i+j +" ");
				i=i+1;
			}
			System.out.println();
			
		}
	}

}
/*      1
    2   3
  4   5   6
7   8   9   10  */