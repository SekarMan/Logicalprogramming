package String;

public class Reversingprintstring {

	public static void main(String[] args) {
		String str="Welcome to India.Trump!Trump!";
		int count=0;
		for(int i=0;i<str.length();i++) {
			if ((str.charAt(i)=='.')||(str.charAt(i)=='!')) {
				count++;//str.charAt(i+1)-32
			}
			
		}
		System.out.println(count);
		// TODO Auto-generated method stub

	}

}
