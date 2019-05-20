package a;
import java.util.Scanner;

public class Solution {
	  public static void main(String[] args) {
		   int n, pos = 0, x,l;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter no. of elements you want in array:");
	        n = s.nextInt();
	        int a[] = new int[n];
	        System.out.println("Enter all the elements:");
	        for(int i = 0; i < n; i++)
	        {
	            a[i] = s.nextInt();
	        }
	        
	        System.out.println("Content of array is :");
	        for(int i = 0; i < a.length; i++)
	        {
	            System.out.println(a[i]);
	        }
	        
System.out.println("Enter the element you want to delete");
int del_element=s.nextInt();
for(int k=0;k<a.length;k++)
{
	if(a[k]==del_element)
	{
		pos=k;
	}
}


for(l=pos+1;l<a.length;l++)
{
	a[l-1]=a[l];
	
}

System.out.println("Array after deleting is");
for(int r=0;r<a.length;r++)
{

System.out.println(a[r]);	
}

	    }
}