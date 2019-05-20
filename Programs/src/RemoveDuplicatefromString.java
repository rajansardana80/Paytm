
public class RemoveDuplicatefromString {
	
	public static void main(String args[])
	{
	  String a="rajan";
	  char c[]=a.toCharArray();
	  String z="";
	  for(int i=0;i<c.length;i++)
	  {
		  if(z.indexOf(c[i])==-1)
		  {
			  z=z+c[i];
		  }
	  }
	  System.out.println(z);
	}

}
