
public class Primeno {
	
	public static void main(String[] args) {
		int no = 20, div = 3;
		boolean check = true;
		while (no > div) {
				if (no % div == 0) {
					System.out.println("not prime");
					check=false;
					break;
				}
				div = div + 2;
			}
			if (check == true && no%2 !=0) {
				System.out.println("prime");
			}
			if(no%2==0) {
				System.out.println("not prime");
			}
			
			
			// TODO Auto-generated method stub
		
			
			
		}}

	


