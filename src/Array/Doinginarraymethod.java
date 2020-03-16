package Array;

public class Doinginarraymethod {

	public static void main(String[] args) {
		int [] array= {10,20,30,10,20,30};
		int [] search= {10,20}; int j=0;
	while(j<search.length) {
		
		int i=0,count=0;
		while(i<array.length) {
			if (array[i]==search[j]) {
				count++;
				
			}
			i++;
		}
			System.out.println(count);
		j++;
		}
		
	}
		// TODO Auto-generated method stub

	}


