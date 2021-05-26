import java.util.Scanner;

public class Palindrome
{

	public static void main(String[] args)
	{
	 Scanner scan=new Scanner(System.in);
	 System.out.println("Enter a number =");
	 int num=scan.nextInt();
	 int temp=num;
	 int a,c;
	 int b=0;
	 while(temp!=0)
	 {
      a=temp%10;
      b=b*10+a;
      temp=temp/10;
	 }
     if (b==num)
     {
    	System.out.println("Entered number is a palindrome number"+num);
     }
     else
     {
    	System.out.println("Entered numer is not a palindrone number"+num);
     }
	}
}