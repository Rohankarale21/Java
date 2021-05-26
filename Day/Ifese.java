import java.util.Scanner;

public class Ifese {

	public static void main(String[] args) {
	int a,b,c;
		System.out.println("enter first number ");
	Scanner scan=new Scanner(System.in);
	a=scan.nextInt();
	System.out.println("enetr the second number ");;
	b=scan.nextInt();
	
	System.out.println("enter the third number ");
	c=scan.nextInt();
	if(a>b)
	{
		if (a>c)
		{
			System.out.println("First number is greatest of all");
		}
		else
		{
			System.out.println("Third number is the greatest of all");
		}
	}
	else if(b>c)
	{
		System.out.println("Second number is greatest of all");
	}
	else 
	{System.out.println("third number is greatest of all");

	}
scan.close();
	}
}
