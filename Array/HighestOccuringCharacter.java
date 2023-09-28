package strings;
import java.util.*;
public class HighestOccuringCharacter {
	public static char highestOccuringChar(String str) {
		
		int n=str.length();

		char  freq[]=new char[256];
		for(int i=0;i<n;i++)
		{
			char ch=str.charAt(i);
			freq[ch]++;
			
		}
		char ans =str.charAt(0);
		int max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++){
		
			if(max<freq[str.charAt(i)])
			{
				max=freq[str.charAt(i)];
				ans=str.charAt(i);
			}

		}
		return ans;
	}
	
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		String str = sr.nextLine();
		char ans = highestOccuringChar(str);
		System.out.println(ans);
		
	}
}
