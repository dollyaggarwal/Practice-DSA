package fundamentals;

public class Loop {

	public static void main(String[] args) {
		int i=10;
	    while((i=i-1)>0)
	    {
	        System.out.print(i);
	        if(i%5==0)
	           // return;
	        	break;
	    }
		if(i<20)
		{
			//i=13;
			System.out.println(i);
		}
	System.out.println(i+2);

	}

}
