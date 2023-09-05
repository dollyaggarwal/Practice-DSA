package tries;

public class TrieUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Trie t=new Trie();
		t.add("NOTE");
		t.add("NOT");
		t.add("DOLLY");
		
		//System.out.println(t.search("DOLLY"));
		//System.out.println(t.search("DOLL"));
		System.out.println(t.search("NOTE"));
		t.remove("NOTE");
		System.out.println(t.search("NOTE"));
		System.out.println(t.search("NOT"));
		
	}

}
