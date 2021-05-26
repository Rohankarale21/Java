import java.util.Scanner;

public class Prime_number {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num;
		int temp=0;
		System.out.println("enter a number");
		num=scan.nextInt();
		for(int i=2;i<=num-1;i++)
		{
			if (num%i==0)
			{
				temp=temp+1;
			}
		}
		if(temp==0)
		{
			System.out.println("entered number is a prime number"+num);
		}
		else
		{
			System.out.println("enetred number is not a prime number "+num);
		}

	}

}
