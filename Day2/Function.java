
public class Function {

	public static void add()
	{
		int a=20;
		int b=30;
		int c=a+b;
		System.out.println("addition is  "+c);
	}
    public static void add(int i,int j)
    {
    	int c=i+j;
    	System.out.println("addition is ="+c);
    }
	public static void add(int i,int j, int k)
	{
		int c=i+j+k;
		System.out.println("addition is = "+c);
	}
	
	public static void add(double i,int j)
	{
		double c=i+j;
		System.out.println("addition is ="+c);
	}
	public static void add (double i,double j)
	{
		double c=i+j;
		System.out.println("addition is ="+c);
	}
	public static void main(String[] args)
	{
		add();
		add(10,20);
		add(10,20,30);
		add(10.3,50);
		add(10.3,50.8);

	}

}
