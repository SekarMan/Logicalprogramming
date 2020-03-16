
public class Dpattern {

	public static void main(String[] args) {
		for (int row = 1; row <= 5; row++) {
			for (int col = 1; col <= 4; col++) {
				if (col==1) {
					System.out.print("*");
				}
				else if(col==2) {
					if((row==1)||(row==5)) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
						
					}
						
					}
				else if(col==3) {
					if ((row==1)||(row==5)) {
						System.out.print(" ");
						
					}
					else {
						System.out.print("*");
					}
				}
				}
			System.out.println();
			}
		
		// TODO Auto-generated method stub

	}

}
