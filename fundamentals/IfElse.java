package fundamentals;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		  int x = 15;
		//		    if(x <= 15){
		//		        System.out.print("Inside if  ");
		//		    }else if(x == 15){
		//		        System.out.print("Inside else if  ");
		//		    }
		//		    System.out.println(x);

				 int var1 = 5; 
			        int var2 = 6;
			        if ((var2 = 1) == var1)
			            System.out.print(var2);
			        else 
			            System.out.print(var2 + 1);
			

		//		   int a=50;
		//		    int b=5;
		//		    if(a/0==b)
		//		    {
		//
		//		        System.out.println("Hello");
		//		    }
		//		    else
		//		    {
		//		        System.out.println("Hi");
		//		    }
		int a=50,b=20;
		if(a>b)
		{
			if(a>100)
				System.out.println("Ace");
			if(b<100)
				b=50;
		}
		else if(a==b)
		{
			System.out.println ("King");
		}
		else 
		{
			System.out.println ("Queen");
		}
	}

}

