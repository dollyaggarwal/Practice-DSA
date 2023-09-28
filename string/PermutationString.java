package strings;
import java.util.*;
public class PermutationString {
	public static boolean isPermutation(String str1, String str2) {
		
		if(str1.length()!=str2.length())
		  return false;
		boolean isperm=true;
		int j;
		for(int i=0;i<str1.length();i++){
			for( j=0;j<str2.length();j++){
				
				if(str1.charAt(i)==str2.charAt(j)){
					
					break;
				}
			}
			if(j==str2.length())
				 return isperm=false;	
		}
		      return isperm;	
			
		}
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		String str1 = sr.nextLine();
		String str2 = sr.nextLine();
		boolean ans =isPermutation(str1, str2);

		System.out.println(ans);
		
	}
	
}
