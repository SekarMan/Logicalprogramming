package Array;

import java.util.Scanner;

public class Lenrayexample {

	public static void main(String[] args) {
		int total=0;
		Scanner sc=new Scanner (System.in);
		int len=sc.nextInt();
		int []marks=new int [len];
		for (int i=0;i<len;i++)
		{
			System.out.println("Please enter marks");
			marks[i]=sc.nextInt();
			total=total+marks[i];
					}
				System.out.println(total);
				sc.close();
		// TODO Auto-generated method stub

	}

}
