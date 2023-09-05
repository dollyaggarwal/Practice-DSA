package fundamentals;
import java.util.Scanner;
public class FahToCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int S=s.nextInt();
		int E=s.nextInt();
		int W=s.nextInt();
		int C;
		while(S<=E)
		{
		C=((S-32)*5)/9;
		System.out.println(S +" "+ C);
		S=S+W;
		
		}

	}

}
