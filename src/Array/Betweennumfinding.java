package Array;

public class Betweennumfinding {

	public static void main(String[] args) {
		int s=0;
		int [] no= {1,5,8};
		while(s<no.length-1) {
			int a=no[s];
			int b=no[s+1];
			int small=a<b?a:b;
			int big=a>b?a:b;
			int i=0;
			for( i=1+small;i<big;i++) {
				System.out.println(i);
			}
			s++;
			
			
		}
				
		// TODO Auto-generated method stub

	}

}
