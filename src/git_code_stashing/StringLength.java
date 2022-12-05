package git_code_stashing;

public class StringLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(wordLength("Hello"));
		System.out.println(wordLengthString("Hello"));
		System.out.println( wordconcat("abc","pqr"));
	}
	
	public static int wordLength(String s)
	{
		return s.length();		
	}

	public static String wordLengthString(String s)
	{
		return s;		
	}
	
	public static String wordconcat(String s,String t)
		{

			System.out.println("First String"+s);

		System.out.println("second String"+t);	

			return s+t;		
		}
	
	
}
