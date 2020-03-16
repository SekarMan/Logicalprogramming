
public class Lcm {

	public static void main(String[] args) {
		int no=2,no1=3;
		int big=no>no1?no:no1;
		int big2=big;
		int small=no<no1?no:no1;
		while(true) {
		if(big%small==0)
		{
			System.out.println(big);
			break;
		}
		big+=big2;
		// TODO Auto-generated method stub

	}

}
}
