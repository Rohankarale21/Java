import java.util.Scanner;

public class Swaping {

	public static void main(String[] args) {
		int a,b,c;
		System.out.println("Enter the first number =");
		Scanner scan=new Scanner(System.in);
		a=scan.nextInt();
		System.out.println("Enter the second number =");
		b=scan.nextInt();
		System.out.println("before swapping a="+a+" and value of b is="+b);
		c=a;
		a=b;
		b=c;
		System.out.println("afer swap value of a="+a+" and the value of b is ="+b);
		
		
		

	}

}
