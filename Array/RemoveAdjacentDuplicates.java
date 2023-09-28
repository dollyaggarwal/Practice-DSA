package strings;

import java.util.Scanner;

public class RemoveAdjacentDuplicates {
	
	 public static String removeDuplicates(String s) {
		 String ans="";
			int i=1;
			char ch=s.charAt(0);
			while(i<s.length())
			{

				if(ch!=s.charAt(i)){

					ans=ans+ch;
					ch=s.charAt(i);

					i++;
				}
				else{
					ch=s.charAt(i+1);
					i+=2;

				}
}
			if(i==s.length())
				ans=ans+ch;

			String ans1="";
			int j=1;
			char ch1=ans.charAt(0);
			while(j<ans.length())
			{

				if(ch1!=ans.charAt(j)){

					ans1=ans1+ch1;
					ch1=ans.charAt(j);

					j++;
				}
				else{
					ch1=ans.charAt(j+1);
					j+=2;

				}
				}
			if(j==ans.length())
				ans1=ans1+ch1;
			return ans1;

		}


	
	
public static void main(String[] args) {
	Scanner sr = new Scanner(System.in);
	String str = sr.nextLine();
	String ans = removeDuplicates(str);;

	System.out.println(ans);

}
}
