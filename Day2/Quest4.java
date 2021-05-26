import java.util.Scanner;

public class Quest4 {

	public static void main(String[] args) {
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
		System.out.println("Elements inside the array are =");
		for (int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
	}

}
