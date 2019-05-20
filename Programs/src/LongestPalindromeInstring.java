
public class LongestPalindromeInstring {
	public static void main(String[] args) {

		String a="forgeeksskeegfor";
		String tmp="";
		if(a.length()==1)
		{
			System.out.println("logest palindrome is : "+a);
		}
		
		else {
			
			String longest = a.substring(0, 1);
			
			for(int i=0;i<a.length();i++)
			{
				
				 tmp=checkequality(a,i,i);
				if(tmp.length()>longest.length()) {
					longest= tmp;
				}
				

				 tmp=checkequality(a,i,i+1);
				if(tmp.length()>longest.length()) {
					longest= tmp;
				}
				
				
	
				
			}
			
			System.out.println(longest);
			
		}
		
		
		
}
	public static String checkequality(String s,int begin,int end)
	{
		while(begin >=0 && end<=s.length()-1 && s.charAt(begin)==s.charAt(end))
		{
			begin--;
			end++;
			
		}
		
		return s.substring(begin +1 ,end);
		
		
	}

}