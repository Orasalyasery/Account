package Bagg2;

public class Exam01 {

	public static void main(String[] args) {
		int a = 0;
		int sum = 0;
		while (a < 10)
		{
			a++;
			if (a % 2==1)
				continue;
			sum +=  a;
		}
		System.out.println(sum);
	
	}

}
