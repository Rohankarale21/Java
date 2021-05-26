import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int result;
         String c,d,ans;
         Scanner sc=new Scanner(System.in);
         System.out.println("enter a number = ");
         int num1=sc.nextInt();
         System.out.println("enter another number = ");
         int num2=sc.nextInt();
         result=num1+num2;
         System.out.println("addition of two number is ="+result);
         System.out.println("enter a character 1 - ");
         c=sc.next();
         System.out.println("enter a character 2 - ");
         d=sc.next();
         ans=c+d;
         System.out.println("addition of both chacter is -"+ans);
	}

}
