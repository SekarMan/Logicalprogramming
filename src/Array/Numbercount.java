package Array;

public class Numbercount {

	public static void main(String[] args) {
		int []a= {10,20,30,10,20,40,10,50};
		int []a1= {10,20};
		int j=0;
		while(j<a1.length) {
			int count=0;
			for (int i=0;i<a.length;i++) {
				if (a[i]==a1[j]) {
					count++;
				}
				
					
			}
			System.out.println(count);
			j++;		
		}
		// TODO Auto-generated method stub

	}

}
