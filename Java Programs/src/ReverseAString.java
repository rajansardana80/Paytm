
public class ReverseAString {

	
	public static void main(String args[])
	{
		String a1="abc";
		
		String reverse="";
		
		char b[]=a1.toCharArray();
		
		for(int i=a1.length()-1;i>=0;i--)
		{
			reverse=reverse + b[i];
		}
		
		
		System.out.println("reverse is :: "+reverse);
	}
}
