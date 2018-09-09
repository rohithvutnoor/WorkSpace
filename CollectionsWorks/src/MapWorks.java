import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapWorks {
	public static <E> void main(String[] args) {
		HashMap<Character, Integer> hMap = new HashMap<Character, Integer>();

		for (int i = 65; i < 91; i++) {
			hMap.put((char) i, new Integer(i));
		}

		
		Set<Entry<Character, Integer>> set1 = hMap.entrySet();
/*		String []st = {"",""};
		for(String str: st) {
			
		}*/
		for (Entry<Character, Integer> obj : set1) {
			System.out.print(obj.getKey() + ": ");
			System.out.println(obj.getValue());
		}
		
		
	}
}
