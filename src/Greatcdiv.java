
public class Greatcdiv {

	public static void main(String[] args) {
		int no=50,no1=18;
	int small=no<no1?no:no1;
	int big=no>no1?no:no1;
	while(small>=2)
	{
		if(no%small==0 && no1%small==0)
		{
			System.out.println("gcd"+small);
			break;
		}
		small--;
	}
		
		// TODO Auto-generated method stub

	}

}
