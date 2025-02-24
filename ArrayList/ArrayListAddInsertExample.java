
import java.util.ArrayList;

class ArrayListAddInsertExample 
{
	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList();
		al.add("C++");
		al.add("Python");
		al.add("Java");
		al.add(0,"C");//
		System.out.println(al);

		ArrayList<String> arraylist = new ArrayList();
		arraylist.add("mySQL");
		arraylist.addAll(al);
		System.out.println(arraylist);
	}
}
