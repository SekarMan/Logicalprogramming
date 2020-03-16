
public class Nofabanocci {

	public static void main(String[] args) {
		int first=0,second=1;
		while(true) {
			int third=first+second;
			first=second;
			second=third;
			if(third==233) {
				System.out.println("i got");
				break;
			}
			else if(third>233) {
				System.out.println("no");
				break;
			}
		}
		// TODO Auto-generated method stub

	}

}
