import java.util.Scanner;

public class Quest9 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int [] arr;
		int sum=0;
		int average=0;
		System.out.println("Enter the size of array=");
		int size=scan.nextInt();
		arr=new int[size];
		System.out.println("Enter the values inside the array ");
		for (int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("summation");
		for (int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("After summation the value is "+sum);
		average=sum/size;
		System.out.println("average of an array is "+average);
		int max =arr[0];
		for (int i=0;i<arr.length;i++)
		{
			if (max<arr[i])
			{
				max=arr[i];
			}
		}	
	
	   System.out.println("Maximum value inside array is ="+max);
	   int min =arr[0];
	   for (int i=0;i<arr.length;i++)
		{
			if (min>arr[i])
			{
				min=arr[i];
			}
		}	
	
	   System.out.println("Maximum value inside array is ="+min);
	   
	

	}

}
