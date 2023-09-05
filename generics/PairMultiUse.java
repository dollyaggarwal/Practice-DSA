package generics;

public class PairMultiUse {
	

	    public static void main(String[] args){

	          MultiplePair<Integer,String> pSI= new MultiplePair<Integer,String>(10,"Ten");

	          System.out.println(pSI.getFirst()+" "+ pSI.getSecond());
	          
	          pSI.setFirst(50);
	          pSI.setSecond("Fifty");
	          
	          System.out.println(pSI.getFirst()+ " " +pSI.getSecond());

	         
	          
	    }
	}

