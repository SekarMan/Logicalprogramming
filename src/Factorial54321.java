
public class Factorial54321 {

	public static void main(String[] args) {
		int given=5;
		do {
			int fact=1,no=1;
			while(no<=given)
			{
				fact=fact*no;
				no++;
			}
			System.out.println(fact);
			given=given-1;
		} while(given>0);
	}
		// TODO Auto-generated method stub

	}


