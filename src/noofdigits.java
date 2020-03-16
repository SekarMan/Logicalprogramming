
public class noofdigits {

	public static void main(String[] args) {
		int no=567898,rem,digits=0;
		while(no>0)
		{
			rem=no%10;
			no=no/10;
			digits++;
			
		}	
		System.out.println(digits);
		// TODO Auto-generated method stub
			}
	}



