package fundamentals;
import java.util.Scanner;

public class TotalSalary {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int bs=s.nextInt();
		char g=s.next().charAt(0);
		double ts,hra,da,pf;
		int allow;
		int sal;
		if(g=='A')
		{
			allow=1700;
		}else if(g=='B')
		{
			allow=1500;
		}
		else
		{
			allow=1300;
		}
		hra=(0.2*bs);
		da=(0.5*bs);
		pf=(0.11*bs);
		ts=(bs+hra+da+allow-pf);
		sal=(int)ts;
		if((ts-sal)>=0.5)
		{
			sal=sal+1;
			System.out.println(sal);
		}
		else{
			sal=sal+0;
			System.out.println(sal);
		}

	}

}
