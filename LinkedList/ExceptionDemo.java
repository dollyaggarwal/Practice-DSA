package exceptionHandling;

public class ExceptionDemo {
	public static int fact(int n) throws NegativeNumberException{
		int fact=1;
		if(n<=0) {
			throw new NegativeNumberException();
		}
		for(int i=1;i<=n;i++) {
			fact=i*fact;
		}
		return fact;
		
}

    public static int divide(int a, int b) throws DivideByZeroException{
        if(b==0){
          throw new DivideByZeroException();
        }
        return a/b;
  }

  public static void main(String[] args) throws NegativeNumberException,DivideByZeroException{
	  
      try{
    	  System.out.println(fact(4));
        System.out.println(divide(10,0));
        System.out.println("Within Try");
      }
//      catch (DivideByZeroException e){
//          System.out.println("Divide by zero exception raised");
//      }
//      catch (NegativeNumberException e) {
//  		System.out.println("Negative Number Exception handled");
//  	}
      catch(Exception e) {
    	  System.out.println("Generic Exception");
      }
      finally {
    	  System.out.println("finally block");
      }
      System.out.println("Main");
  }

}
