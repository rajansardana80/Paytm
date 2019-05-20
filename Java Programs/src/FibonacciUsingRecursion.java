
public class FibonacciUsingRecursion {

	static int n1=0,n2=1,n3=1;
	public static void main(String args[])
	{
		int a=10;
		
		System.out.println(n1);
		System.out.println(n2);
		
		fibonacci(a-2);
	}
	
	public static  void fibonacci(int a)
	{

	
		
		if(a>=1)
		{
			
			
		n3=n1+n2;
		n1=n2;
		n2=n3;
		
		System.out.println(n3);
		fibonacci(a-1);
		}
		
		
		//return n3;
	}
}
