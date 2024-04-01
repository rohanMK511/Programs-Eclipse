package javaPrograms;

public class Program08_RemoveWhiteSpaces {

	public static void main(String[] args) {
		
		String s = "  v  v  d s fdsafa  ";
		
		/*
		s = s.strip();
		System.out.println(s);
		*/
		
		char[] strArray = s.toCharArray();
		
		StringBuffer string = new StringBuffer();
		for(int i= 0; i < strArray.length; i++)
		{
			if((strArray[i]!=' ')&&(strArray[i]!='\t')) {
				string.append(strArray[i]);
			}
		}
		System.out.println(string.toString());
	}

}
