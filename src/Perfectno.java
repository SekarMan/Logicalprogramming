
public class Perfectno {

	public static void main(String[] args) {
		int sum=0,no=6;
		for(int i=1;i<no;i++) {
			if(no%i==0) {
				sum=sum+i;
			}
		}
			if(sum==no) {
				System.out.println("perfect");
			
			}
			
			else {
				System.out.println("not perfect");
			}
		}
		// TODO Auto-generated method stub

	}



