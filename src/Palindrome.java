
public class Palindrome {

	public static void main(String[] args) {
		int no=543,sum=0,no1=no;
		while(no>0) {
			int rem=no%10;
			no=no/10;
			sum=sum*10+rem;
		}
			if(no1==sum) {
				System.out.println("Palindrome");
			}
			else if(no1!=sum) {
				System.out.println("not Pal");
			}
		}
		// TODO Auto-generated method stub

	}


