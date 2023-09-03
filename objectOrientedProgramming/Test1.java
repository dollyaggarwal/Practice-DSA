package objectOrientedProgramming;

public class Test1 { 
    int a; 
    int b; 
    Test1() 
    {   
        this(10, 20);   
        System.out.print("constructor one "); 
    } 
    Test1(int a, int b) 
    { 
        this.a = a; 
        this.b = b; 
        System.out.print("constructor two "); 
    } 
}
class new_test{
    public static void main(String[] args) 
    { 
        Test1 t1 = new Test1();   // When the object of Test class is created,the constructor
        							//with no arguments is called.
        						  //When  this(10,20) is encountered , the constructor with two arguments
        							//int and int is called because this is the reference of the object. 
        							//So using this way we can call more than one constructor.
    } 
} 