package Collection;

import java.util.TreeSet;

public class treeset {
public static void main(String[] args) {
	TreeSet t=new TreeSet();
	t.add(800);
	t.add(400);
	t.add(200);
	t.add(100);
	t.add(500);
	t.add(600);
	t.add(700);
	t.add(300);
	
	//print entire data
	
	System.out.println(t);
	
	//delete last number
		t.pollLast();
		//delete first number
		t.pollFirst();
		System.out.println(t);
}
}
