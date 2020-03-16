package String;

public class Findingmobno {

	public static void main(String[] args) {
		String s="9374329710";
		char[]ch=s.toCharArray();
		boolean flag=true;
		if(ch.length==10) {
		for(int i=0;i<ch.length;i++) {
			char c=ch[i];
			int asc=(int) c;
			if(!((asc>=48) && (asc<=57))){
				System.out.println("not mob no");
				flag=false;
				break;
			
		}
		}if(flag==true) {
				System.out.println("valid mob no");
			
			}
		// TODO Auto-generated method stub

	
		
			
		

		}}}
