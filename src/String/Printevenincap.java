package String;

public class Printevenincap {

	public static void main(String[] args) {
		String s= "abcd";
		char[] alpha = s.toCharArray();
		// char[]alpha= {'a','b','c','d'};
		int i = 0;
		while (i < alpha.length) {

			char ch1 = alpha[i];
			
			if(i%2==0) {
			int ch11 = (int) ch1 - 32;
			System.out.println((char) ch11);

			// TODO Auto-generated method stub

			
		}
			else {
				int ch11=((int) ch1);
				System.out.println((char)ch11);
			}
			i++;
	}
}
// TODO Auto-generated method stub

		// TODO Auto-generated method stub

	}


