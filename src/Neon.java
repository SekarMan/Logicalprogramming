
public class Neon {

	public static void main(String[] args) {
		int no=8,sq,sum=0;
		sq=no*no;
		while(sq>0) {
			int rem=sq%10;
			sum=sum+rem;
			sq=sq/10;
			
		}
		if(sum==no) {
			System.out.println("neon");
			
		}
		else {
			System.out.println("not neon");
		}
		// TODO Auto-generated method stub

	}

}
