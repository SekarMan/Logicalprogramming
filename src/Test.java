
public class Test {
	public static void main(String args[]) {
		int no=6,div=1,sum=0;
		while(div<no) {
			if (no%div==0) {
				sum=sum+div;
			}
			div=div+1;
		}
		
			if(sum==div) {
			System.out.println("perfect");
			
			}
			else {
				System.out.println("not perfect");
			}
			
			
			}
		}
	


