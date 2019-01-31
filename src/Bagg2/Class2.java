package Bagg2;
import Bagg3.Math1;
public class Class2 {

	
		public static void main(String[] args) 
		{
			Math1 aa= new Math1();
			aa.aaadd(2,2);
			int a1 , b1;
			double a2 , b2;
			a1=5;
			b1=7;
			a2=10;  
			b2=13;
			add(a1,b1);
			add(a2,b2);
			
		}
	  static int add(int a, int b)
	 {
		 System.out.print("add 2 integer =");
		 System.out.println	(a+b);		 
		 	return a+b;	
	}
	static double add(double a , double b )
	 {
		 System.out.print("add 2 double=");
		 System.out.println	(a+b);		 
		 	return a+b;		 
	 }
	}