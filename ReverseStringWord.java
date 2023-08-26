package strings;

import java.util.Scanner;

public class ReverseStringWord {

    public static String reverseEachWord(String str){
    	int start=0,end=0;
    	String ans="";
    	for(int i=0;i<str.length();i++)
    	{
    		if(str.charAt(i)==' '||i==str.length()-1) {
    			end=i;
    			String rvstr="";
    			for(int j=start;j<=end;j++)
    			{
    				rvstr=str.charAt(j)+rvstr;
    				
    			}
    			rvstr=rvstr.trim();
    			ans=ans+rvstr+" ";
    			start=i+1;
    		}
    	}
    	return ans;
    	//Alternative method
    	
//    	  String ans="";
//          int currentWordStart=0;
//          int i=0;
//          for(;i<str.length();i++){
//              if(str.charAt(i)==' '){
//                  //Reverse Current Word
//                  int currentWordEnd=i-1;
//                  String reversedWord="";
//                  for(int j=currentWordStart;j<=currentWordEnd;j++){
//                      reversedWord=str.charAt(j)+reversedWord;
//                  }
//                  //Add it final String(ans)
//                  ans+=reversedWord+" ";
//                  currentWordStart=i+1;
//              }
//          }
//          int currentWordEnd=i-1;
//          String reversedWord="";
//          for(int j=currentWordStart;j<=currentWordEnd;j++){
//              reversedWord=str.charAt(j)+reversedWord;
//          }
//          ans+=reversedWord;
//          return ans;
      }
     
    
    public static void main(String args[]) {
    	Scanner s=new Scanner(System.in);
    	String str=s.nextLine();
    	String ans=reverseEachWord(str);
    	System.out.println(ans);
    	
    }
}
    	




