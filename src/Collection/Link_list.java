package Collection;

import java.util.LinkedList;

public class Link_list {
public static void main(String[] args) {
	LinkedList LL=new LinkedList();
	LL.add("Ganpati");
	LL.add(100);
	LL.add('A');
	LL.add(null);
	LL.add(null);
	LL.add(100);
	//print entire data
	System.out.println(LL);
	//get the size
	System.out.println(LL.size());
	//check wheter it is empty
	System.out.println(LL.isEmpty());//false
	//inseration operation (right shift)
	LL.add(1,"Suresh");
	System.out.println(LL);
	//deletation operation(left shift)
	LL.remove(1);
	System.out.println(LL);
	
}
}
