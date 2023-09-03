package objectOrientedProgramming;

public class Final_Static_Vairiables {
	  public String name;
	    final private int rollNumber;
	    double cgpa;
	    final double converisonFactor= 0.95;
	    static int numStudents;

	    public  Final_Static_Vairiables (String name, int rollNumber){
	      this.name=name;
	      this.rollNumber= rollNumber;
	      numStudents++;
	    }

	    public void print(){
	      System.out.println(name+" "+rollNumber);
	    }
}
	     class FinalStaticUse
	    {
	        public static void main(String[] args){
	            //Scanner s = new Scanner(System.in);
	        System.out.println( Final_Static_Vairiables.numStudents);//right way to call static variable by class
	            //System.out.println(Student.name);

	            Final_Static_Vairiables  f1 = new Final_Static_Vairiables("Manisha",50);

	            Final_Static_Vairiables  f2= new  Final_Static_Vairiables("Ankush",125);
	            Final_Static_Vairiables  f3= new  Final_Static_Vairiables("Ankush",125);

	            System.out.println(f1.numStudents);//not a right way to call static variable with object
	            System.out.println(f2.numStudents);//not a right way to call static variable with object
	        }
	    }

