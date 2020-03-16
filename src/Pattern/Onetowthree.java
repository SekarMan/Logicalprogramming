package Pattern;

public class Onetowthree {

	public static void main(String[] args) {
		int no=1;
		for (int row=3;row>=1;row--) {
			for (int col=1;col<=row;col++) {
				System.out.print(no);
				no++;
			}
			
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
