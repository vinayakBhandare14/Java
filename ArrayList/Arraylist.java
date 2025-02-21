
import java.util.*;

class Arraylist 
{
	public static void main(String[] args) 
	{
		//by using collection
		Collection c = new ArrayList(); // creating ArrayList by using Collection
		c.add(44);
		c.add("hi");
		c.add(99.99);
		System.out.println("Collection c :: "+c);

		//by using List
		List l = new ArrayList(c);
		l.add("Vinayak");
		l.add(true);
		System.out.println("List l :: "+l);

		//by using ArrayList
		ArrayList al = new ArrayList(20);
		al.addAll(l); // it's used to add other arrays in one 
		al.add(false);
		al.add("welcome Home");
		al.add(443322);
		System.out.println("ArrayList :: "+al);
	}
}
