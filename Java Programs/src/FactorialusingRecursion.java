
public class FactorialusingRecursion {

	public static void main(String args[])
	{
		int a=5;
		int b=1;
		int g=0;
		
		 g=factorial(a);
		 System.out.println(g);
	}
	public  static	int factorial(int a)
	{
		int b=1;
		while(a>=1)
		{
		b=a*factorial(a-1);
		return b;
		}
		return b;
		
	}
	
}
