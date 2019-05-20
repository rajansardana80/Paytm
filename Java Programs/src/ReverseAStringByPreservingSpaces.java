import javax.swing.text.AbstractDocument.LeafElement;

public class ReverseAStringByPreservingSpaces {

	public static void main(String args[])
	{
		
		
		String s1="Hello rajan is a cool boy";
		
		char a1[]=s1.toCharArray();
		
		char a2[]=new char[a1.length];
		String reverse="";
		for(int i=0;i<a1.length;i++)
		{
		if(a1[i]==' ')
		{
			a2[i]=a1[i];
		}
		}
		int k=a2.length-1;
		for(int j=0;j<=a1.length-1;j++)
		{
			if(a1[j]==' ')
			{
						
			continue;
			}
			
			if(a2[k]==' ')
			{
				k--;
			}
			
			a2[k]=a1[j];
			k--;
			
						}
	System.out.println(String.valueOf(a2));
	}
	
}
