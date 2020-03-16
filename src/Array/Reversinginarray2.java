package Array;

public class Reversinginarray2 {

	public static void main(String[] args) {
		int []arr1= {3,8,2,5,4};
		
		int len=arr1.length;
		
		int []arr2=new int [len];
		
		int i=0,j=len-1;
		while(i<arr1.length) {
			arr2[i]=arr1[j];
		
		System.out.println(arr2[i]);
		i++;
		j--;
				
		// TODO Auto-generated method stub
		}
	}

}
