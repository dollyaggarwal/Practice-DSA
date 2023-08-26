package strings;
import java.util.*;
public class RemoveConsecutiveDuplicates {
	public static String removeConsecutiveDuplicates(String str) {
		
		String ans="";

		ans=ans+str.charAt(0);
		int j=0;
		for(int i=1;i<str.length();i++){

					if(ans.charAt(j)!=str.charAt(i)){
							j++;
						ans=ans+str.charAt(i);
					}
				}
					return ans;
	}
	
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		String str = sr.nextLine();
		String ans = removeConsecutiveDuplicates(str);;

		System.out.println(ans);
		
	}
}
