package a;

public class j {




public static void main(String[] args)
{
	
	
	int a[]=new int[5];
	a[0]=20;
	a[1]=10;
	a[2]=3;
	a[3]=1;
	int i=0;
	int temp=0;
	for(i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
		
			if(a[i]>a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			
		}
	}
	for(int k=0;k<a.length;k++)
	{
		System.out.println(a[k]);
	}
	}

}
