
public class Squareroot {

	public static void main(String[] args) {
		int no=81,div=2;
		while(div<=no/2)
		{
			if (no/div==div)
			{
				System.out.println(div+"is sq root");
				break;
			}
			div++;
		}
		// TODO Auto-generated method stub

	}

}
