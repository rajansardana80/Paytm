
public class SecondHighestInArray {
	
	
	public static void main(String args[])
	{
	int a1[]= {5,1,2,8,9,0,21,31,15};
	int temp=0;
	for(int i=0;i<=a1.length-2;i++)
	{
		for(int j=i+1;j<=a1.length-1;j++)
		{
			if(a1[j]>a1[i])
			{
			temp=	a1[j];
			a1[j]=a1[i];
			a1[i]=temp;
			}
		}
		
		
	}
	
	System.out.println(a1[1]);
	}
}
