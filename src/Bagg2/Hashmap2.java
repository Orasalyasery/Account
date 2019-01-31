package Bagg2;
public class Hashmap2 {
	static int a[] = new int[10];

	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			a[i] = (i+1)*10;
		}
		System.out.println("========================");
		for(int i=0; i<10; i++) {
			System.out.println(a[i]);
		}
		System.out.println("========================");
		
		insert(1,70);
		System.out.println("========================");
		for(int i=0; i<10; i++) {
			System.out.println(a[i]);
		}

	}
	public static void insert(int index, int value) {
		for(int i = a.length-1; i > index; i--) {
			a[i] = a[i-1];
		}
		a[index]= value;
	}
}
