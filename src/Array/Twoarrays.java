package Array;

public class Twoarrays {

	public static void main(String[] args) {
		int [] array1= {5,3,2,4,7};
		int no=60;
		int len=array1.length;
		int [] array2=new int [len+1];
		int len2=array2.length; //6
		array2[len2-1]=no;//array2[5]=60
		

		for(int i=0;i<array1.length;i++) {
			

            array2[i]=array1[i];
		//
            System.out.println(array2[i]);
	
		}
		for(int i=0;i<array2.length;i++) {
			array2[0]=60;
			array2[5]=5;
			
			System.out.println(array2[i]);
		}
		
	}// TODO Auto-generated method stub

}


