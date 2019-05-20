import java.util.Arrays;

public class RemoveDuplicates {
	
	public static void main( String args[])
	{
		int a[] = {10,20,30,40,50,10,20,50};
		
		Arrays.sort(a);
		int temp[]= new int[a.length];
		int j=0;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]!=a[i+1])
			{
				temp[j]=a[i];
				j++;
			}
		}
		temp[j++]=a[a.length-1]; 
		
		for(int h=0;h<j;h++)
		{
		 a[h]=temp[h];
		 System.out.println(a[h]);
		}
		
	}

}
