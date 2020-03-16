package Array;

public class Mergingtwoarray {

	public static void main(String[] args) {
		int [] a= {10,20,30};
		int []b= {5,15};
		int []result=new int [a.length+b.length];
		int i=0,k=0;
		while(i<result.length) {
			if(i<a.length) {
				result[i]=a[i];
			}
			else {
				result[i]=b[k];
				k++;
			}
			System.out.println(result[i]);
			i++;
		}
		
		// TODO Auto-generated method stub

	}

}
