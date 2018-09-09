import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListDemo {
	public static void main(String[] args) {

		String[] names = { "Nitin", "Rohith", "Prakash" };
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i] + " ");
		}
		System.out.println();

		ArrayList<String> list = new ArrayList<String>();

		
		

		/*
		 * for (Iterator iterator = list.iterator(); iterator.hasNext();) { String
		 * string = (String) iterator.next(); System.out.println(string+" "); }
		 * System.out.println();
		 */
		for (String str : names) {
			list.add(str);
		}
		Iterator<String> i = list.iterator();
		ListIterator<String> li = list.listIterator();
		System.out.println();
		while (i.hasNext()) {
			System.out.print(i.next() + "->");

		}
		System.out.println("\n");
		
		while (li.hasNext()) {
			li.next();
		}
		while(li.hasPrevious()) {
			System.out.print(li.previous()+"<-");
		}
		
		System.out.println();
		
/*		do {
			System.out.print(li.next()+"^");
		}while (li.hasPrevious());
		System.out.print("^"+li.previous());*/
		
		
		System.out.println();
		for (int i1 = 0; i1 < 3; i1++) {
			System.out.print(list.get(i1) + " ");
		}
		System.out.println("\n\n" + list);

	}
}
