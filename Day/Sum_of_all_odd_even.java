import java.util.Scanner;

public class Sum_of_all_odd_even 
{

	public static void main(String[] args)
	{
		{
			int number, i, even = 0, odd = 0;
			Scanner sc = new Scanner(System.in);
			
			System.out.print(" Please Enter any Number : ");
			number = sc.nextInt();	
			
			for(i = 1; i <= number; i++)
			{
				if(i % 2 == 0)
				{
					even = even + i; 
				}
				else
				{
					odd = odd + i;
				}
			}
			System.out.println("The Sum of Even Numbers upto " + number + "  =  " + even);
			System.out.println("The Sum of Odd Numbers upto " + number + "  =  " + odd);
		}
	}

	}



