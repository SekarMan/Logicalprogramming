package Array;

public class Reversingarraytry {

	public static void main(String[] args) {
		int []a= {3,4,5,6};
		int len=a.length;
		int []r=new int [len];
		int j=0,i=len-1;
		while(j<len) {
			//for (int i=3;i<=len;i--) {
				r[j]=a[i];
				System.out.println(r[j]);
				j++;
				i--;
			}
			
		}
		
		// TODO Auto-generated method stub

	}


