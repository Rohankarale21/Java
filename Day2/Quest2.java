import java.util.Scanner;

public class Quest2 {

	public static void main(String[] args)
	{
		
		Scanner scan=new Scanner(System.in);
		int a,b,c,d,e,f;
		int total,percentage;
	    String name;
	    System.out.println("enter your roll number ");
	    a=scan.nextInt();
	    System.out.println("enter your name ");
	    name=scan.next();
	    System.out.println("enter your first subject marks ");
	    b=scan.nextInt();
	    System.out.println("enter your second subject marks");
	    c=scan.nextInt();
	    System.out.println("enter your third subject marks ");
	    d=scan.nextInt();
	    System.out.println("enter your fourth subject marks ");
	    e=scan.nextInt();
	    System.out.println("enter your fifth subject marks ");
	    f=scan.nextInt();
	    total=b+c+d+e+f;
	    System.out.println("total marks obtained out of 500 is"+total);
	    percentage=(total/5);
	    System.out.println("your percentage are "+percentage);
	    if (percentage>=75)
	    {
	    	System.out.println("your grade is 'A'");
	    }
	    else if (percentage<=74&&percentage>=60)
	    {
	      System.out.println("your grade is 'B'");
	    }
	    else 
	    {
	    	System.out.println("your grade is 'C'");
	    }
	 
	    
		
	

	}

}
