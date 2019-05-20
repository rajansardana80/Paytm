package a;

import java.util.Scanner;

public class q {
	
	
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	int j=0;
	int testcase=sc.nextInt();
	int a[]= new int[testcase];
	for(int p=0;p<testcase;p++)
	{
		 a[p]=sc.nextInt();	
	}
	
	int num;
	for(int k=0;k<testcase;k++)
	{
		num=a[k];
		for(int h=1;h<=num;h++)
		{
			if(h%15==0)
			{
				System.out.println("FizzBuzz");
			}
			else if (h%3==0)
			{
				System.out.println("Fizz");
			}
			else if(h%5==0)
			{
				System.out.println("Buzz");
			}
			else
			{
				System.out.println(h);
			}
		}
		
	}
	
	
	}
}
