package String;

public class Vowels {

	public static void main(String[] args) {
		String []name={"Imthiaz","Varun","Dinesh"};
		int i=0,count=0;
		while(i<name.length) {
			char[]na=name[i].toCharArray();
			char f=na[0];
			
			switch(f) {
			case 'a':
			case 'A':
			case 'e':
			case 'E':
			case 'i':
			case 'I':
			case 'o':
			case 'O':
			case 'u':
			case 'U':
			count++;
			
			}
			i++;
			
		}System.out.println(count);
		// TODO Auto-generated method stub

	

}}
