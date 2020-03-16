
public class Primenotill20 {

	public static void main(String[] args) {

		int no = 3;
		
		int primeCount=1;
		 
while(primeCount<20)
{
	boolean check = true;
			if (no % 2 != 0) {
				int div=3;
				while (div < no) {
					if (no % div == 0) {
						//System.out.println("not prime");
						check = false;
						break;
					}
					div = div +2 ;
				}
				if (check == true) {
					System.out.println(no + "is a prime");
					primeCount++;
				
				} 
			
			
}
			no=no+2;
			

	}
}
}
