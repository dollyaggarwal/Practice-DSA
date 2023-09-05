package fundamentals;

public class BitwiseOpt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a1=10,b1=50;
//	    a1++;
//	    --b1;
//	    int c=a1--+b1--;
//	    System.out.println(++c);
//	    
//	    int a=10,b=20;
//	    System.out.println(a+++--b);//line 1
//	    System.out.println(a--+ ++b);//line 2
//	    System.out.println(a++-++b);//line 3
//	    System.out.println(a+++ ++b);//line 4
	    
//	    int d=10;
//	    int e=2;
//	    System.out.println(d & e);
//	    System.out.println(d | e);
//	    System.out.println(d ^ e);
//	    System.out.println(~d);
//	    System.out.println(~e);
//	    int a=10,b=-20;
//	    System.out.print(a^b);
		
		
//		
//	    int a=10,b=20;
//	    int c=a&b;
//	    System.out.print(c);
//	    int d=a|b;
//	    System.out.print(d);
//	    int e=a^b;
//	    System.out.print(e);
//	    int f=c+d+e;
//	    System.out.println(~f);
//	    System.out.println(a<<1);
//	    System.out.println(a<<2);
//	    System.out.println(a>>1);
//	    System.out.println(a>>3);

		
		  int a = 42;
		  System.out.println(~a);
	       int b = ~a; // (there is tilde sign before a)
	       System.out.println(a + " " + b);
	       
	       
//	       int x , y = 1;
//	         x = 10;
//	         if (x != 10 && x / 0 == 0)// will not execute x/0 becoz of && operator gives 1st condition false
//	             System.out.println(y);
//	         else
//	             System.out.println(++y);
//	         
	         
	         int x1 = 15;
	         int y1 = x1++;
	         int  z1 = ++x1;
	         System.out.println(y1 +" " + z1);
	         
	         
	         int g = 3;
	         System.out.println(++g * 8);
	         
//	         int x =10;
//	         int y = 20;
//	         if(x++ > 10 && ++y > 20 ){
//	         System.out.print("Inside if  ");
//	         }else{
//	         System.out.print("Inside else  ");
//	         }
//	         System.out.println(x +" "+y);
	         
	         int x = 10;
	         int y = 20;
	         if(x++ > 10 || ++y > 20 ){
	        System.out.print("Inside if  ");
	         }else{
	        System.out.print("Inside else  ");
	         }
	         System.out.println(x  + " " + y);
	         
	         int a1=5;
	         a1+=5+(++a1)+(a1++);
	         System.out.println(a1);
	         int a2=10;
	         a2+=++a2-5/3+6*a2;
	         System.out.print(a2);
	}

}
