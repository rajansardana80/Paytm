
public class ArrayRotation {
	
	public static void main(String args[])
	{
		int a1[]= {10,20,30,40,50};
int rotate=2;
int temp=0;
int l=0;

for(int i=0;i<=rotate;i++)
{
	temp=a1[0];
	
	for(int j=l+1;j<=a1.length-1;j++)
	{
		a1[l]=a1[j];
		l++;
	}
	a1[a1.length-1]=temp;
	l=0;
}
System.out.println("Array after rotation");
for(int k=0;k<=a1.length-1;k++)
{
System.out.println(a1[k]);

}
}

}
