import java.util.Arrays;

public class DuplicatesInArray {
	
	
	public static void main(String[] args)
	{
	int a[]= {10,20,30,40,50,10,20};
	Arrays.sort(a);
	int b[]=new int[a.length];
	int i=0;
	int j=0;
	for( i=0;i<a.length-1;i++)
	{
		
		
			if(a[i]!=a[i+1])
			{
				b[j]=a[i];
				j++;
			}
		
	}
	
	b[j++]=a[a.length-1];
	
	for(int k=0;k<j;k++)
	{
		a[k]=b[k];
		System.out.println(a[k]);
	}
	
	

}
}