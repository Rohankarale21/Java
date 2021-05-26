import java.util.Scanner;

public class Quest11 {

	public static void main(String[] args) 
		{
			boolean flag=true;
			int choice = 0,sum1=0;
			Scanner sc= new Scanner(System.in);
			
			System.out.println("Enter Choice for purchase it: ");
			System.out.println("1. Pen");
			System.out.println("2. Pencil");
			System.out.println("3. Notebook");
			System.out.println("4. bottle");
			System.out.println("5. ColorBox");
			System.out.println("7. exit");
			
			
			while(flag!=false)
			{
				System.out.println();
				choice=sc.nextInt();
				switch(choice)
				{
				
				case 1:
					int total=0;
					System.out.println("Enter number of Pen");
					int numpen=sc.nextInt();
					total=10*numpen;
					sum1+=total;
					System.out.println("total amt= "+total);
					break;
				
				case 2:
					int total1=0;
					System.out.println("Enter number of Pensil");
					int numpens=sc.nextInt();
					total1=5*numpens;
					sum1+=total1;
					System.out.println("total amt= "+total1);
					break;
				
				case 3:
					int total2=0;
					System.out.println("Enter number of Notebook");
					int numnot=sc.nextInt();
					total2=20*numnot;
					sum1+=total2;
					System.out.println("total amt= "+total2);
					break;
				
				case 4:
					int total3=0;
					System.out.println("Enter number of Bottle");
					int numbott=sc.nextInt();
					total3=30*numbott;
					sum1+=total3;
					System.out.println("total amt= "+total3);
					break;
				
				case 5:
					int total4=0;
					System.out.println("Enter number of ColorBox");
					int numcol=sc.nextInt();
					total4=50*numcol;
					sum1+=total4;
					System.out.println("total amt= "+total4);
					break;
				
				case 6:
					flag=false;
					break;
				default:
					break;
				}
					
			}
			System.out.println("Total Sum IS = "+sum1);
			
			sc.close();
		}

	
	}


