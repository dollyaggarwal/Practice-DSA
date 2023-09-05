package fundamentals;

public class ForLoop {

	public static void main(String[] args) {
		 for(int i=483;i>0;i=i%3)
		    {
		        System.out.print("*");
		    }
		 
		 
       int n=5;
		
		for(int i=1; i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if((i+1)==j) {
					break;
				}
				System.out.print(j);
				
			}
			System.out.println();
		}
		
		int i1=0;
	    for(;;)
	    {
	        if(i1==5)
	            break;
	        System.out.print(i1);
	        i1++;
	    }
	    
		for(int i=1;;i++)
	    {   if(i>5)
	        {
	            break;
	            //System.out.print("break statement reached");//unreachable code
	        }
	        System.out.print(i);
	    }
	}

}
