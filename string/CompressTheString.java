package strings;
import java.util.*;
public class CompressTheString {
public static String getCompressedString(String str) {
		
		String compstr="";
		
		int n=str.length();
		
		int i=0,j=0;
			int count=0;
			while(i<n-1&&j<n){

			if(str.charAt(i)==str.charAt(j)){

			count++;
			j++;
			continue;
			}
			if(count>1){
				compstr=compstr+str.charAt(i)+count;
				i=j;
				count=0;
				
			}
			else{
			compstr=compstr+str.charAt(i);
			i=j;
			count=0;
			}
				
		}
		if(count>1){
				compstr=compstr+str.charAt(i)+count;
				i=j;
				count=0;
				
			}
			else{
			compstr=compstr+str.charAt(i);
			i=j;
			count=0;
		}
			
 return compstr;
	}
public static void main(String[] args) {
	Scanner sr = new Scanner(System.in);
	String str = sr.nextLine();
	String ans = getCompressedString(str);
	System.out.println(ans);
	
}
}
