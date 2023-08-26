package strings;

public class ReverseString {
	public static String reverseString(String str)
	{
		String rvstr="";
//		for(int i=str.length()-1;i>=0;i--) {
//			rvstr=rvstr+str.charAt(i);
//		}
		
		//Alternate method
		for(int i=0;i<str.length();i++) {
			rvstr=str.charAt(i)+rvstr;
		}
		return rvstr;
	}

	public static void main(String[] args) {
		String str="abcde";
	      String rvstr=reverseString(str);
	      System.out.println(rvstr);
	      
		
	}

}
