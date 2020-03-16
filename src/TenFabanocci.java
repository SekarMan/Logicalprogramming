
public class TenFabanocci {

	public static void main(String[] args) {
		int first=0,second=1,count=1;
		while(true) {
			int third=first+second;
			count++;
			first=second;
			second=third;
			if(count==10) {
				System.out.println(third);
				break;
				
			}
		}
		
		// TODO Auto-generated method stub

	}

}
