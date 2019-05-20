import java.util.Arrays;

public class Anagram {

	
	public static void main(String args[])
	{
		String s1= "K eep";
		String s2= "pee Kq";
		
		String s3=s1.replaceAll(" ", "");
		String s4=s2.replaceAll(" ", "");
		
		String s5=s3.toLowerCase();
		String s6=s4.toLowerCase();
		
		char a1[]=s5.toCharArray();
		char a2[]=s6.toCharArray();
		
		Arrays.sort(a1);
		Arrays.sort(a2);
		
		if(Arrays.equals(a1, a2)) {
			
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not Anagram");
		}
		
	}
}
