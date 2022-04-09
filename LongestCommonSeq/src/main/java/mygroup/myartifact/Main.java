package mygroup.myartifact;

public class Main {

	public static void main(String[] args) {
		System.out.println("ok");
	}
	
	public static String longestCommonSequence(String a, String b)
	{
		if(a == null || b == null)
			return "";
		if(a.isEmpty() || b.isEmpty())
			return "";
		String r = "";
		int nextsize = 1;
		int apos = 0;
		while(apos + nextsize <= a.length())
		{
			String t;
			while(apos + nextsize <= a.length() && b.contains(t = a.substring(apos, apos + nextsize)))
			{
				r = t;
				nextsize++;
			}
			apos++;
		}
		return r;
	}
}
