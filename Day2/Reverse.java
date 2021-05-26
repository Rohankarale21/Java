import java.util.Scanner;

public class Reverse {

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
		int temp;
		int start=0;
		int end=size-1;
		while(start<end)
		{
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		System.out.println("array elements after reversing is =");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
	}

}
