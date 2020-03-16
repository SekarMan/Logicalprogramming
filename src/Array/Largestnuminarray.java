package Array;

public class Largestnuminarray {

	public static void main(String[] args) {
		int []no= {3,7,2,8,5};
		int max= Integer.MIN_VALUE; int min=Integer.MAX_VALUE;
		int i=0;
		while(i<no.length) {
			if(max<no[i]) {
				max=no[i];
			}
			if(min>no[i]) {
				min=no[i];
			}
		i++;
		}
		System.out.println(max);
		System.out.println(min);
		// TODO Auto-generated method stub

	}

}
