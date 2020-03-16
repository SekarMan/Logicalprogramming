
public class Apattern {

	public static void main(String[] args) {
		for (int row=1;row<=4;row++) {
			for (int col=1;col<=3;col++) {
				if ((row==1) && ((col==1)||(col==3))) {
					System.out.print(" ");
				}
				else if((row==2) && (col==2)) {
					System.out.print(" ");
				}
				else if((row==4) && (col==2)) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
