package Bagg1;

public class ForLoop {
	public static void main(String[] args) {
		
		
		String[] s = new String[4];
		

		for (int i = 0; i <= 4; i++)

		{
			System.out.println(s[i]);
		}
		for (String string : s) {

			System.out.println(string);

		}
		int[] num = new int[10];
		for (int i = 0; i<num.length; i++)
		{
			System.out.println(num[i]);
		}
		double d[] = new double[10];
		
		for (double dou : d)
		{
			System.out.println(dou);

		}
		
		String[] sTr = { "Muhammed", "oras", "Ali" };
		for (String str : sTr) {
			System.out.println(str);
		}

	}
}
