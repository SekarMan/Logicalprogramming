package Array;

public class Chaningplaceinarr {

	public static void main(String[] args) {
		int [] m= {5,6,8,9};
		int i=0;
		int temp=m[i];
		while(i<m.length-1) {
			m[i]=m[i+1];
			i++;
			
			System.out.println(m[i]);
		}
		System.out.println(m[i]=temp);
		
		}
		
		
			
		// TODO Auto-generated method stub

	}


