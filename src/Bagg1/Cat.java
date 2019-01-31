package Bagg1;
public class Cat {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Fas.eat();
		int i = -200;
		byte s=(byte)i;
		System.out.println("S = "+s);
		System.out.println("*****************");
		
		Cat c = new Cat();
		System.out.println("Result1 =   "+ c.result1());
		System.out.println("Result2 =   "+ c.result2());
		System.out.println("Result3 =   "+ c.result3());
		System.out.println("Result4 =   "+~(~(4)));

		System.out.println("*****************");
		int d = 8;
		int h = d>>2;
		int x = d<<2;
		System.out.println("h =  "+h);
		System.out.println("x =  "+x);
		System.out.println("*****************");
		int k= -8;
		System.out.println("k = " +(k>>>3));
		System.out.println("*****************");
					int  r = 4;
					int  p = 7;
		System.out.println("& = " +(r&p));
		System.out.println("| = " +(r|p));
		System.out.println("^ = " +(r^p));
		System.out.println("*****************");
			Cat catt =new Cat();
			boolean bol = catt instanceof Object;
			System.out.println("Boolean = " + bol);

	}
	int result1()
	{
		int a ;
		a = 5+2*3;
		return a;			
	}
	int result2()
	{
		int b;
		b = (5+2)*3;
		
		return b;

}
	int result3()
	{
		int z;
		z = -4 * -3;
		
		return z;

}
}
