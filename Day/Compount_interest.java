
public class Compount_interest {

	public static void main(String[] args) {
		double a=20000;
		double b=6;
		double c=3;
		double interest;
		double amount;
		amount=a*Math.pow((1+b/100), c);
		interest=amount-a;
		
		System.out.println("the interest amount is "+interest);
		System.out.println("the compound interest is "+amount);
		

	}

}
