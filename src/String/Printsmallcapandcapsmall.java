package String;

public class Printsmallcapandcapsmall {

	public static void main(String[] args) {
		String s="m. gULASEKAR";
		char[]ch=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			char c=ch[i];
			int asc=(int) c;
			if((asc>=65) && (asc<=91)) {
				System.out.print((char)(asc+32));
			}
			else if((asc>=97) && (asc<=122) ) {
				System.out.print((char)(asc-32));
			}
			else {
				System.out.print(ch[i]);
			}
		}
		// TODO Auto-generated method stub

	}

}
