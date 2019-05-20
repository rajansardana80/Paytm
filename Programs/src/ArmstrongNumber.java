
public class ArmstrongNumber {
	
	public static void main(String args[])
	{
		int a=153;
		int c=a;
		int x,mul,sum=0;
while(a>0)
{
		
	x=a%10;
	mul=x*x*x;
		sum=sum+mul;
		a=a/10;
		
	}

if(c==sum)
{
	System.out.println("No is armstrong");

}
else {
	System.out.println("No is not armstromg");
}
}
}