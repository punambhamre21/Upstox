package Collection;

import java.util.HashSet;

public class hashset {
public static void main(String[] args) {
	
	HashSet hs=new HashSet();
	
	hs.add("Ankush");
	hs.add(100);
	hs.add('A');
	hs.add(100);
	hs.add(null);
	hs.add(null);
	//print entire data
	System.out.println(hs);
	//size
	System.out.println(hs.size());
	//empty
	System.out.println(hs.isEmpty());
	//clear methoda
	hs.clear();//it will clear entire data in collection
	System.out.println(hs);
	
}
}
