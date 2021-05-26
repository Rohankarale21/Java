import java.util.Scanner;

public class Armstrong_nos {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int len=0;
		int num,rem;
		System.out.println("enter a number ");
		num=scan.nextInt();
		int t1=num;
		while(len!=0)
		{
			len=len+1;
			t1=t1/10;
			
		}
		int t2=num;
		int arm=0;
		while (t2!=0)
		{
			int mul=1;
			rem=t2%10;
			for (int i=1;i<=len;i++)
			{
				mul=mul*rem;
				
			}
			arm=arm+mul;
			t2=t2/10;
			
		}
		if (arm==num)
		{
			System.out.println("entered number is armstrong number"+num);
			
		}
		else
		{
			System.out.println("entered number is not a armstrong number");
		}

	}

}
