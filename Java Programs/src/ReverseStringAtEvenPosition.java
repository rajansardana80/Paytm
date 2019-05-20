
public class ReverseStringAtEvenPosition {
	
	public static void main(String[] args)
	{
		
		String s1="Hello I Am Rajan cool boy";
		
		String s2[]=s1.split(" ");
		String reverse="";
		String s3="";
		for(int i=0;i<s2.length;i++)
		{
		
			 if(i%2==0)
			{
				 s3=s3+s2[i]+" ";
			}
			else
			{
			

			char c1[]=s2[i].toCharArray();

			for(int j=c1.length-1;j>=0;j--)
			{
			reverse=reverse+c1[j];
			}
			
			s3=s3+reverse+" ";
			reverse="";
			}
			 
			 
		}
		
		System.out.println(s3);
	}

}
