import java.util.Scanner;

public class Sum_of_series {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number =");
		int a=scan.nextInt();
		int sum=0;
		for(int i=1;i<=a;i++)
		{
			sum=sum+i;
		}
        System.out.println("addition of a number till "+a+"will be"+sum);
	}

}
