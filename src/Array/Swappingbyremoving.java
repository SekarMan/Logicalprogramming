package Array;

public class Swappingbyremoving {

	public static void main(String[] args) {
		int [] array= {5,3,2,4,7};
		int no=3,i=0;
		while(i<array.length) {
			if (array[i]==3) {
				break;
				
			}
			i++;
		}
		//System.out.print(i);
		//array[1]=array[2];
		//array[2]=array[3];
		//array[3]=array[4];
		for(int j=i;j<array.length-1;j++) {
			array[j]=array[j+i];
			System.out.print(array[j]);
		//}
		
		//for(int j= 0;j<array.length;j++) {
			//System.out.println(array[j]);
		}
		// TODO Auto-generated method stub

	}}



