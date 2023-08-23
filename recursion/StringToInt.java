package recursionaAssignment;
import java.util.*;
public class StringToInt {
	public static int convertStringToInt(String input){
		 if (input.length()==0)
       {
           return 0;
       }
       int smallOutput=convertStringToInt(input.substring(0,input.length()-1)); //recursion for  len-1 chars

       int lastdig=(int)input.charAt(input.length()-1); //last char
      lastdig=(lastdig-48);
       return (lastdig)+(smallOutput*10);
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(convertStringToInt(input));
	}
}
