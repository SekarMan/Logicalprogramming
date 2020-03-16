package Array;

public class Countofgivenelementinarray {

	public static void main(String[] args) {
		int [] array= {10,20,10,30,40,10,25};
		int search=10,count=0,search2=20,count1=0,i=0;
		while(i<array.length) {
			if(array[i]==search) {
				count++;
			}
				
			
			else if(array[i]==search2) {
				count1++;
				
			}
			i++;
		}
		System.out.println(count);
		System.out.println(count1);
		
		// TODO Auto-generated method stub

	

	}
	}

