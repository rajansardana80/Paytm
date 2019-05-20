import java.util.HashMap;
import java.util.Map;

public class FindAllPairsInArray {
	
	public static void main(String args[])
	{
		int a[]= {3, 4, 7, 1, 2, 9, 8};
		int sum=0;
		HashMap<Integer, String> map=new HashMap<Integer,String>();
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				sum=a[i]+a[j];
				if(map.containsKey(sum))
				{
				System.out.println(a[i]+""+a[j] +"and"+map.get(sum));
				}
				else {
					map.put(sum,a[i]+""+a[j]);
				}
				}
			
		}
		
		/*for(Map.Entry<String, Integer> m:map.entrySet())
		{
			if(m.)
		}*/
	}

}
