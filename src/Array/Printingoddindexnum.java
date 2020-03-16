package Array;

public class Printingoddindexnum {

	public static void main(String[] args) {
		int []array= {10,20,30,40,50};
		int []result=new int [array.length/2];
		int i=0,j=1;
		while(i<result.length) {
			result[i]=array[j];
			System.out.println(result[i]);
			
			i++;
			j+=2;
		}
			
			//System.out.println(result[i]);
			}
		//System.out.println(result[i]);
		// TODO Auto-generated method stub

	
}
