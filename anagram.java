import java.util.*;
class anagram
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two strings");
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		s1=s1.replaceAll(" ","");
		s2=s2.replaceAll(" ","");
		if(s1.length()==s2.length())
		{
			char[] ch=s1.toLowerCase().toCharArray();
			char[] ch1=s2.toLowerCase().toCharArray();
			Arrays.sort(ch);
			Arrays.sort(ch1);
			if(Arrays.equals(ch,ch1))
			System.out.println("two strings are anagram");
			else
			System.out.println("not anagram");
		}
		else
		{
			System.out.println("not anagram");
		}
	}
}