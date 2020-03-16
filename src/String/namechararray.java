package String;

public class namechararray {

	public static void main(String[] args) {
		String name="Imthiaz";
		 int ch='I';
		 int c=ch+32;
		 char cap=(char) (c);
		System.out.println(ch);
		
		int count=0;
		name=name.toLowerCase();
		//System.out.println(n);
		char[]namearr=name.toCharArray();
		for (int i=0;i<namearr.length;i++) {
			//if((namearr[i]==ch)||(namearr[i]==cap)) {
			if((name.charAt(i)==ch)||(name.charAt(i)==cap)) {
				count++;
			}
		}
		System.out.println("i appears is"+ count);
		// TODO Auto-generated method stub

	}

}
