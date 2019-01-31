package Bagg2;
class A {
	public int getNumber(int a)
	{
		return a+1;
	}
	}

class B extends A {
	public int getNumber(int a)
	{
		return a+2;
	}
}

public class Exam05overlididing {

	public static void main(String[] args) {
		A b = new B();
		System.out.println(b.getNumber(0));

	}

}
