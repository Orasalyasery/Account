package Bagg2;

class Animal 
{
	private void say() {}
	public void move() {
		System.out.println("Animals Can move ");
	}
	
}
class Dog extends Animal {
	private void say() {}
}
public class RuleNumber4 {

	public static void main(String[] args) {
			Animal a = new Animal();
			Animal b = new Dog();
			a.move();
			b.move();
			
	}

}
