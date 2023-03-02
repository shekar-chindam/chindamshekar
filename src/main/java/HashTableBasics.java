import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashTableBasics {

	public static void main(String[] args) {
		Map<Integer, String> ht = new Hashtable<Integer, String>();

		ht.put(1, "Shekar");
		ht.put(2, "value 2");
		ht.put(3, "value 3");
		ht.put(4, "value 4");

		String value = ht.get(1);

		System.out.println(value);
		System.out.println(ht.containsKey("shekar"));
		boolean bool = ht.containsValue("Shekar");
		System.out.println(bool);

	}

}
