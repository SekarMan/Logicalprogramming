
public class Binarytodec {

	public static void main(String[] args) {
		int no=10010,count=0,dec=0;
		while(no>0)
		{
			int rem=no%10;
			dec=dec+(rem*(int)Math.pow(2,count));
			no=no/10;
			count++;
			
		}
		System.out.println(dec);
		// TODO Auto-generated method stub

	}

}
