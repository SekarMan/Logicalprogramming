package Array;

public class Minsecondminarray {

	public static void main(String[] args) {
	
			int []no= {3,5,2,8,7};
			int min=Integer.MAX_VALUE;
			int min2=Integer.MAX_VALUE;
			int i=0;
			while(i<no.length) {
				if(no[i]<min) {
					
					min2=min;
					min=no[i];
				}
				else if(no[i]<min2) {
					min2=no[i];
				}
				
				i++;
					}
			System.out.println(min);
			System.out.println(min2);
		// TODO Auto-generated method stub

	}

}
