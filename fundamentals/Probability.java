package fundamentals;
import java.util.Scanner;
public class Probability {
	
	  public static int factorial(int num){
	        int fact=1;
	        for(int i=2;i<=num;i++){
	            fact*=i;
	        }
	        return fact;
	    }
	    public static int probability(int n,int x){
	                
	         double Ns,Ne1,Ne2;
	        int Probab;
	        Ns=factorial(8)/(factorial(n)*factorial(8-n));
	        Ne1=factorial(4)/(factorial(x)*factorial(4-x));
	        Ne2=factorial(4)/(factorial(((n-x)))*factorial((4-(n-x))));
	        Probab=(int)(((Ne1*Ne2)/Ns)*100);
	        return Probab;

	    }

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int x=s.nextInt();
		System.out.println(probability(n,x));



	}

}
