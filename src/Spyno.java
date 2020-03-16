
public class Spyno {

	public static void main(String[] args) {
		int no=112,prod=1,sum=0;
		while(no>0) {
			int rem=no%10;
			sum=sum+rem;
			prod=prod*rem;
			no=no/10;
		}
		if(prod==sum)
		{
			System.out.println("spy");
		}
		else {
			System.out.println("not spy");
		}
		// TODO Auto-generated method stub

	}

}
