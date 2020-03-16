package String;

public class Firstnonrepeatword {

	public static void main(String[] args) {
		String str="sarvesh";
		for(int j=0;j<str.length();j++) {
			boolean repeat=false;
			char c1=str.charAt(j);
			for(int i=j+1;i<str.length()-1;i++) {
				if(c1==str.charAt(i)) {
					repeat=true;
				}
			}
			if(repeat==false) {
				System.out.println(c1+" non repeated");
				break;
			}
		}
		// TODO Auto-generated method stub

	}

}
