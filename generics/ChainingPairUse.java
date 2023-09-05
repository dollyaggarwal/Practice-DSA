package generics;

public class ChainingPairUse {

	    public static void main(String[] args){

	          ChainingPair<String, Integer> pInner= new ChainingPair<String, Integer>("ab",100);
	          
	          ChainingPair<ChainingPair<String, Integer>, String> p= new ChainingPair<>();
	          
	         // p.setFirst(PInner);
	          
	          System.out.println(p.getFirst());
	          System.out.println(p.getFirst().getFirst());
	          System.out.println(p.getFirst().getSecond());

	    }
	}

