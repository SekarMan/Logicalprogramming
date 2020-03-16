package Pattern;

public class Reverseprint123 {

	public static void main(String[] args) {
		int no=1;
		for (int row=1;row<=3;row++) {
			for (int space=2;space>=row;space--) {
				System.out.print(" ");
			}
			
				for (int col=1;col<=row;col++) {
					
					System.out.print(col);
				}
				
				System.out.println();
		// TODO Auto-generated method stub

	}

}}
