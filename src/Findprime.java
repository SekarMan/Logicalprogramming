
public class Findprime {

	public static void main(String[] args) {
		int no=27,div=3;
		boolean check=true;
		while(div<no)
		{
			if(no%div==0)
			{
				System.out.println(no+" is not prime");
				check=false;
				break;
				}
			div=div+2;
		}
		if (check==true)
		{
			System.out.println(no+" is prime");
		}
		// TODO Auto-generated method stub

	}

}
