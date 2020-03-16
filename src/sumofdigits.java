
public class sumofdigits {

	public static void main(String[] args) {
		int no=1234,rem,sumofdigits=0;
		while(no>0)
		{
			rem=no%10;
			sumofdigits=sumofdigits+rem;
			no=no/10;
			
		}
		System.out.println(sumofdigits);
		// TODO Auto-generated method stub

	}

}
