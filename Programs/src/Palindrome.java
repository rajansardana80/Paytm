
public class Palindrome {
	
	public static void main(String args[])
	{
		
		String a= "nitin";
		String c="";
		char b[]= a.toCharArray();
		
		for(int i=b.length-1;i>=0;i--)
		{
			c=c+b[i];
			
			
			
		}
		if(a.equals(c))
		{
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("String is not palindrome");
		}
	}

}
