
public class MaximumSumOFElementsInArray {

	public static void main(String args[])
	{
		int a[]= {10,20,12,15,11};
		int sum = 0,sum1=0;
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length-1;j++)
			{
			sum1=a[i]+a[j];
			if(sum1>sum)
			{
				sum=sum1;
			}
			}
		}
		
		System.out.println(sum);
	}
}
