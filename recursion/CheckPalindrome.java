package recursionaAssignment;
import java.io.*;
import java.util.List;
import java.util.StringTokenizer;
import java.util.Scanner;
public class CheckPalindrome {
	   public static boolean isPalindrome(String str) {
		     if(str.length()<=1)
		     return true;
		     
		        int i=0,j=str.length()-1;
		      
		        if(str.charAt(i)==str.charAt(j)){
		           
		          //  String substr= str.substring(i+1,j);
		          String substr=isPalindrome1(str);
		           return   isPalindrome(substr);
		            
		        }
		        else{
		            return false;
		        }
		    }
		    
		  public static String isPalindrome1(String str) {
		 int i=0,j=str.length()-1;
		String substr=str.substring(i+1,j);
		return substr;
		}
		  public static void main(String[] args) {
		        takeInput();
		        executeAndPrintOutput();
		  }
		  private static int t ;
		    private static String []str;

		  private static void takeInput() {
		      Scanner sc=new Scanner(System.in); 
			  t = 1;
		        str = new String[t];
		        for(int i = 0; i < t; i++){
		            str[i] = sc.next();
		        }
		    }
		  private static void executeAndPrintOutput() {
		        for(int i = 0; i < t; i++){
		            boolean ans = isPalindrome(str[i]);
		            if(ans)
		                System.out.println("true");
		            else
		                System.out.println("false");
		        }
		    }
}
