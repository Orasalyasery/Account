package Bagg1;


public class Sumprime {

	public static void main(String[] args) {
		int sum =0,i,number,count;
		
		for ( number =1; number<=100;number++) {

	count=0;
for (i=2;i<=number/2;i++) {
	if (number % i==0)
	{
	count ++;
	break;
	}
}
if (count ==0&& number !=1)
{sum=sum+number;}
}
		System.out.println("\n the sum of 100 prime Number are :"+sum);
}
}