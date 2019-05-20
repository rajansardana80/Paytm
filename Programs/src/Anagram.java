import java.util.Arrays;

public class Anagram {
	
	public static void main(String args[])
	{
		String a="Kee p";
		String z="p eek";
		
	a.replaceAll(" ", "");
		z.replaceAll(" ", "");
		
		a.toLowerCase();
		z.toLowerCase();
		char f[]=a.toCharArray();
		char w[]=z.toCharArray();

		Arrays.sort(f);
    Arrays.sort(w);
    
    if(Arrays.equals(f, w))
    {
    System.out.println("anagram");
    }
    else
    {
    System.out.println("not an anagram");
    }	
	}

}
