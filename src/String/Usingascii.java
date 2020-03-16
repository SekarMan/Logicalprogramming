package String;

public class Usingascii {

	public static void main(String[] args) {
		//char[] alpha= {'A','B','C'};
		char[]alpha= {'a','b','c'};
		int i=0;
		while(i<alpha.length) {
		char  ch1=alpha[i];
		int ch11=(int) ch1-32;
		System.out.println((char)ch11);
		i++;
		// TODO Auto-generated method stub

	}

}}
