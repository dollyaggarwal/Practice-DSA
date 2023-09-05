package fundamentals;
import java.util.*;
public class NthFibonacci {

//	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		int n= s.nextInt();
//		int a=1, b=1;
//		int c=0;
//		if(n==a) {
//			System.out.println(a);
//		}else if(n==2) {
//			System.out.println(b);
//		}
//		else {
//			
//		for(int i=2;i<=n;i++) {
//				c=a+b;
//			if(n==i) {
//				System.out.println(c);
//			}
//		
//			a=b;
//			b=c;
//		}
//		}
//		
//	}

	public static boolean checkMember(int n){
		
	
int a=0, b=1,c=0;
		boolean fib=true;
		int i;
for( i=0;i<=n;i++) {
				c=a+b;	
		
			if(n==a || n==c) 
			return fib;
			a=b;
			  b=c;
			
}
	return fib=false;
	
				}
	
	//using recursion
	
	public static boolean checkMember1(int n){

	    if (n == 0 || n == 1) {
	        return true;
	    }
	    return isFibonacciRecursive(n, 0, 1);
	}

	private static boolean isFibonacciRecursive(int n, int a, int b) {
	    if (b == n) {
	        return true;
	    }
	    if (b > n) {
	        return false;
	    }
	    return isFibonacciRecursive(n, b, a + b);


				}
	
//	static int fib(int n) 
//    { 
//    if (n <= 1) 
//       return n; 
//    return fib(n-1) + fib(n-2); 
//    } 
//       
    public static void main (String args[]) 
    { 
         Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
    //System.out.println(fib(n)); 
    } 
        
}




