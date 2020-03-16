
public class Prime20 {

	public static void main(String[] args) {
		int no = 3, primecount = 1;
		while (primecount < 20) {
			boolean check = true;

			if (no % 2 != 0) {
				int div = 3;
				while (div < no) {
					if (no % div == 0)
					{
						check = false;
					break;
				}
				div=div+2;
			}
			if (check == true) {
				System.out.println(no);
				primecount++;
			}
		
			
			// TODO Auto-generated method stub

		}
			no = no + 2;
	}
}
}
