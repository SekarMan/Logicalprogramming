
public class Test3 {

	public static void main(String[] args) {
		int no=0,no1=1,count=1;
		while(count<=30) {
			boolean check=true;
			no1=no+no1;
			no=no1-no;
			int div=3;
		
				if (no1 % div == 0) {
					//System.out.println("not prime");
					check=false;
					break;
				}
				div = div + 2;
			
			if (check == true && no1%2 !=0) {
				System.out.println(no1);
				break;
			}
			//if(no1%2!=0) {
				//int div=3;
				//while(div<count) {
					//if(no1%3==0) {
						//check=false;
						//break;
			count++;
					}
					
				
				//if(check==true) {
					//System.out.println(no1);
					//break;
				}
				////div=div+2;
			}
		
		// TODO Auto-generated method stub
			//count++;
	


