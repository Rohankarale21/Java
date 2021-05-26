import java.util.Scanner;

public class Factorial_of_a_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner scan=new Scanner(System.in);
         System.out.println("enter a number= ");
         int a=scan.nextInt();
         int b=1;
         for(int i=1;i<=a; i++)
         {
        	 b=b*i;
     
         }
         System.out.println("factorial of a "+a+"is"+b);
	}

}
