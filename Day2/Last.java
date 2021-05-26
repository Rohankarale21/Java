import java.util.Scanner;

public class Last {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		boolean flag=true;
		int choice;
		int sum=0;
		System.out.println("1-pen");
		System.out.println("2-pencil");
		System.out.println("3-nootebook");
		System.out.println("4-bootle");
		System.out.println("5-colour box");
		System.out.println("enter your choice ");
		while (flag=false)
		{
			choice=scan.nextInt();
			switch (choice)
			{
			case 1:
			int total=0;
			System.out.println("Enter number of Pen");
			int numpen=scan.nextInt();
			total=10*numpen;
			sum=sum +total;
			System.out.println("total amt= "+total);
			break;
			case 2:
				int total1=0;
				System.out.println("Enter number of Pensil");
				int numpens=scan.nextInt();
				total=5*numpens;
				sum=sum+total1;
				System.out.println("total amt= "+total1);
				break;
				
			}
		
			System.out.println("Total Sum IS = "+sum);
		}
	
		
		

	}

}
