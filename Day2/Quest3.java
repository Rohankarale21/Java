import java.util.Scanner;

public class Quest3 {

	
	public static void swap(int a, int b)
	{
		int temp=a;
		a=b;
		b=temp;
		System.out.println("After swap the values of a "+a+" and of b is "+b);
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a,b;
		
		System.out.println("enetr first number ");
		a=scan.nextInt();
		System.out.println("enetr second number ");
		b=scan.nextInt();
	    swap(a,b);
		

	}

}
