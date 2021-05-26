import java.util.Scanner;

public class Power_of_number {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double a,b,c;
		
		System.out.println("enter a number ");
		a=scan.nextInt();
		System.out.println("enter a exponent for a number ");
        b=scan.nextInt();
        c=Math.pow(a, b);
        System.out.println("The output for the given number "+a+"with exponent"+b+"and the result is "+c);
	}

}
