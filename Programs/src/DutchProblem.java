
public class DutchProblem {

	public static void main(String args[])
	{
		int a[] = {0,1,2,1,2,0,1};
		int i=0,j=0;
		int k=a.length-1;
	int temp=0;
		while(j<=k)
	{
		switch (a[j])
		{
		case 0:
		{
			temp=a[j];
			a[j]=a[i];
			a[i]= temp;
			i++;
			j++;
			
		}
		case 1:
			j++;
		case 2:

			temp=a[j];
			a[j]=a[k];
			a[k]= temp;
			k--;
			//j++;
		}
	}
		
		for(int h= 0;h<a.length;h++)
		{
		System.out.println(a[h]);	
		}
	}
	
}
