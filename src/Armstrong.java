
public class Armstrong {

	public static void main(String[] args) {
		int no=153,no2=no;
		int arm=0,rem=0;
		while(no>0)
		{
			rem=no%10;
			arm=arm+(rem*rem*rem);
			no=no/10;
		}
		if (no2==arm)
		{
			System.out.println("arm");
			
			
		}else 
		{
			System.out.println("not arm");
		}
		// TODO Auto-generated method stub

	}


}
