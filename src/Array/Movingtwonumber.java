package Array;

public class Movingtwonumber {

	public static void main(String[] args) {
		int []no= {1,2,3,4,5};
		int i=0,j=2;
		int tem1=no[i+1];
		int tem2=no[i];
		int len =no.length;
		int []no1= new int [len];
		while(i<no.length-2) {
			no1[i]=no[j];
			System.out.println(no1[i]);
			i++;
			j++;
			
		}
		System.out.println(no[i]=tem1);
		System.out.println(no[i]=tem2);
		
		
		// TODO Auto-generated method stub

	}

}
