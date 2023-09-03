package objectOrientedProgramming;

public class Student {
	 public String name;
	    private int rollNumber;

	    public Student(String n, int num){
	      name=n;
	      rollNumber= num;
	    }

	    public Student(String n){
	      name=n;
	      rollNumber= 10;
	    }
	    public Student(){
	      name="abc";
	      rollNumber=10;
	    }
	    public void print(){
	    System.out.println(name+" "+rollNumber);
	    }
}
 class StudentUse{
    public static void main(String[] args){
        //Scanner s= new Scanner(source)
        Student s1 = new Student("Manisha",50);
        s1.print();
        Student s2= new Student("Ankush");
        s2.print();
        Student s3= new Student();
        s3.print();
        //s1.rollNumber = 10;
        //s1.setRollNumber(100);
        //System.out.println(s1.name + " "+ s1.getRollNumber());
        //System.out.println("s2"+s2);
        //s2.setRollNumber(100);
        //s2.name= "Ankush";
        //s2.rollNumber= 50;
        //System.out.println(s2.name + " ");
        //System.out.println(s2.name + " "+ s2.rollNumber);
        //System.out.println(s1.rollNumber);

    }
}

