
public class Fabanocci {

	public static void main(String[] args) {
		
		int first=0,second=1,third=0;
	System.out.println(first);
		System.out.println(second);
		for(int i=2;i<=10;i++) {
			{
			second=first+second;
			int div = 3;
			boolean check = true;
			while (second > div) {
				if (second % div == 0) {
					//System.out.println("not prime");
					check=false;
					break;
				}
				div = div + 2;
			}
			if (check == true && second%2 !=0) {
				if(second!=1)
				System.out.println("prime "+ second);
			
			
			//System.out.println(second);//third=first+second; 
			first=second-first;	       //first=second;
				                         //second=third;
			}
		//System.out.println(third);	
		}
		// TODO Auto-generated method stub

	}
	}
}
