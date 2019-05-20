
public class ArmstringNumber {

	
	public static void main(String[] args)
	{
		int num=153;
		int b=0;
		int sum=0;
		while(num>0)
		{
			b=num%10;
			sum= sum+(b*b*b);
			num=num/10;
		}
		
		System.out.println(sum);
		if(num==sum)
		{
			System.out.println("Armstrong");
			
		}
		else {
			System.out.println("Not Armstrong");
		}
	}
}
