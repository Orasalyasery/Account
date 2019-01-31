																																																																																																																																																																																																																																																																																																								package Bagg1;
//import java.io.BufferedReader;
import java.io.IOException;
//import java.io.InputStreamReader;

public class AA {

	public static boolean aaa()
	{
		System.out.println("AAA");
		return false;	
	}
	public static boolean bbb()
	{
		System.out.println("BBB");
		return true;	
	}
	// + , - , * , / , %
	public static void main(String[] args) throws  IOException {
		
			boolean bool = 5 < 3 && 7 >=3 ;      //true
			// false && true
			boolean bool1 = 10 != 3 || 7 <=3 ;  //true
			//  true  && false
			System.out.println("bool =   "  +bool);
			System.out.println("bool1 =   "  +bool1);
			boolean bool3 = aaa() & bbb();
			System.out.println(("bool3   =" + bool3));
			System.out.println("*************");
		int x = 9;
		int year = 0;
		switch (x) {
		
		case 9 :
		case 0 :
		   year = 1800;
		   break;
		case 1:
		case 2:
			 year = 1900 ;
			 
		case 3 :
		case 4 :
		   year = 2000;
		   break;
		   default :
			   System.out.println("Errorinput . ");
		}
	}
	}


