package fundamentals;

import java.util.Scanner;

public class NumberSequence {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
	        int n = s.nextInt();
	        int prev = s.nextInt();
	        int count = 1; // Initialize the count to 2 since we already have the first two numbers
	        int current;
	        boolean isDec = true; // Flag to track if the sequence is strictly decreasing

	        while (count <= n) {
	            current = s.nextInt();
	            count++;
	            
	            // Now we start to check the sequence

	            if (current == prev) {
	                System.out.println("false"); // If two numbers are equal, we simply exit the loop and print false
	                return;
	            } else if (current < prev) {
	                if (isDec == false) {
	                    System.out.println("false"); // If the sequence breaks the strictly decreasing pattern, print false and return
	                    return;
	                }
	            } else {
	                if (isDec == true) {
	                    isDec = false; // If the sequence starts to increase, set the isDec flag to false
	                }
	            }

	            prev = current; // Update the previous element for the next iteration
	        }

	        System.out.println("true"); // If the loop completes without printing false, the sequence satisfies the conditions, so we print true
	}

}
