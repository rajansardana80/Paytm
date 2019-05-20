
public class PrimeNumber {
	
	public static void main(String args[])
	{
		int a=97;
		int b=0;
		
		for(int i=2;i<a;i++)
		{
			
			
			if(a%i==0)
			{
				b=1;
			}
		
		}
		if(b==1)
		System.out.println("No is not prime");
		else
		{
			System.out.println("No is prime");
		}
	}

}
