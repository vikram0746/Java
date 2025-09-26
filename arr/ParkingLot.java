package arr;

public class ParkingLot {
	public static void main(String[] args) {
		int a[][]= {
				{1,0,1},
				{0,1,1},
				{0,0,1},
		};
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				if(a[i][j]==0) {
					System.out.println("Park here"+i+" and "+j);
				}
				else {
					System.out.println(i+" and "+j+"is full");
				}
			}
		}
	}

}
