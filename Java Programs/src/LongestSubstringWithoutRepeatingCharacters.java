import java.util.LinkedHashMap;

public class LongestSubstringWithoutRepeatingCharacters {

	
	public static void main(String args[])
	{
		String a= "javaconceptoftheday";
		
		int longest=0;
		String l="";
		
		char c1[]=a.toCharArray();
		
		LinkedHashMap<Character,Integer> li= new LinkedHashMap<Character,Integer>();
 		
		
		for(int i=0;i<=c1.length-1;i++)
		{
		if(li.containsKey(c1[i]))
		{
			i=li.get(c1[i]);
			li.clear();
		}
		else
		{
			li.put(c1[i], i);
		}
		
		if(li.size()>longest)
		{
			l=li.keySet().toString();
		}
		
		}
		System.out.println(l);
	}
}
