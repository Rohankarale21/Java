import java.util.Scanner;

public class Searching {

	public static void main(String[] args) {
		int num;
		Scanner scan=new Scanner(System.in);
		int [] arr;
		System.out.println("Enter the size of array=");
		int size=scan.nextInt();
		arr=new int[size];
		System.out.println("Enter the values inside the array ");
		for (int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter number to search inside array= ");
		num=scan.nextInt();
		for (int i=0;i<arr.length;i++)
		{
			if (arr[i]==num)
			{
				System.out.println("Element is present inside the array at loc."+i);
				
			}
			else
			{
				System.out.println("element does not exist");
			}
		}
	}

}
