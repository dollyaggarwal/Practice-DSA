package recursionaAssignment;
import java.util.*;
public class CheckAB {
	public static boolean checkAB(String input) {
        // Base case: If the string is empty, return true
        if (input.length() == 0) {
            return true;
        }
        if(input.length()==1 && input.charAt(0)=='a')
        return true;

        // Check if the first character is 'a'
        if (input.charAt(0) == 'a') {

            if (input.length() >= 2 && input.charAt(1) == 'a') {
                return checkAB(input.substring(1));
            } else if (input.length() >= 3 && input.charAt(1) == 'b' && input.charAt(2) == 'b') {
                return checkAB(input.substring(3));
            }
        }
        // If none of the above conditions are met, return false
        return false;
    }
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.next();
		System.out.println(checkAB(input));
	}

}
