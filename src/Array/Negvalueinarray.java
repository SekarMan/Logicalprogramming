package Array;

public class Negvalueinarray {

	public static void main(String[] args) {
		int[]arr1= {-5,8,-3,10};
		int count=0;int i;
		for(i=0;i<arr1.length;i++) {
			if (arr1[i]<0) {
				count++;
				//System.out.println(i);
			}}

		
			int[] result=new int [count];
			
			int j=0;
			for(i=0;i<arr1.length;i++) {
				if(arr1[i]<0){
					result[j]=arr1[i];
					System.out.println(result[j]);
					j++;
				}
				
					
					//System.out.println(result[j]);
					
				}
				//System.out.println(result[j]);
			}
			
		
		// TODO Auto-generated method stub

	}


