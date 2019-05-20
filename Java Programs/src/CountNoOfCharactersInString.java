import java.util.HashMap;

public class CountNoOfCharactersInString {

public static void main(String args[])
{
	
	String s1="abc";

	char a1[]=s1.toCharArray();
	
	HashMap<Character,Integer> map=new HashMap<Character,Integer>();
	for(int i=0;i<a1.length;i++)
	{
		
		
		if(map.containsKey(a1[i]))
		{
			map.put(a1[i],map.get(a1[i])+1 );
		}
		else
		{
			map.put(a1[i],1);
		}
	}
	
	System.out.println(map);

}

}
