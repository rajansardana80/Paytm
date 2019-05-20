
public class ThirdHighestInRepeatedNumbersArray {

	
	public static void main(String [] args)
	{
		int a[] = {99,67,12,311};
		
		int k=3;
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]>a[i])
				{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
			}
		}
		
		System.out.println("Third highest : "+a[k-1]);
	}
}
