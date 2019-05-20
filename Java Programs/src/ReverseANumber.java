
public class ReverseANumber {
	
	public static void main(String[] args)
	{
		int n=100012;
		int b=0;
		int sum=0;
		while(n>0)
		{
			b=n%10;
			sum= sum*10+b;
			n=n/10;
		}
		
		System.out.println(sum);
	}

}
