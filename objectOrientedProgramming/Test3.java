package objectOrientedProgramming;

public class Test3 {

	    static int marks;
	    void set_marks(int marks)
	    {
	        this.marks=marks;               //Line 1
	    }
	}
	class MCQ {
	    public static void main (String[] args) {
	        Test3 t=new Test3();              
	        t.set_marks(78);                //Line 2
	        System.out.print(Test3.marks);   //Line 3
	    }
	}


