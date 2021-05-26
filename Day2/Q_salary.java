import java.util.Scanner;

public class Q_salary {

	public static void salary1(int sal)
	{double a,b;
		double total;
		double hra=0.2;
		double da=0.8;
		a=sal*da;
		b=sal*hra;
		total=sal+a+b;
		System.out.println("total salary is "+total);
				
	}
	public static void salary2(int sal)
	{double a,b;
		double total;
		double hra=0.3;
		double da=0.95;
		a=sal*da;
		b=sal*hra;
		total=sal+a+b;
		System.out.println("total salary is "+total);
				
	}
	public static void salary3(int sal)
	{double a,b;
		double total;
		double hra=0.25;
		double da=0.9;
		a=sal*da;
		b=sal*hra;
		total=sal+a+b;
		System.out.println("total salary is "+total);
				
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int sal;
		System.out.println("Enter your salary =");
		sal=scan.nextInt();
		if (sal>=20000)
		{
			salary2(sal);
		}
		else if (sal<=20000 && sal>=10000)
		{
			salary3(sal);
		}
		else
		{
			salary1(sal);
		}

	}

}
