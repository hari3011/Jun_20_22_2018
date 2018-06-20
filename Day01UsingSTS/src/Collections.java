import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Collections {

	public static void main(String[] args) {
		//packages in java are equivalent of namespaces in c#, BUT ....
		//Map, Set, List are present in java.util
		
		
		int[] numbers = new int[10];
		int numbers2[] = new int[10];
		
		//In MODERN DAYS 2D arrays are NOT USED AT ALL
		String[][] matrix1 = new String[10][];
		String[] matrix2[] = new String[20][];
		String matrix3[][] = new String[20][];
		String matrix4[][] = new String[20][10];
		
		int j = 10;//Primitive
		Integer obj = new Integer(10);//Reference
		
		//Dictionary in C#
		//Wrapper classes for int, boolean, float, double Integer, Boolean, Float, Double
		Map<Integer, String> romans = new HashMap<>();
		romans.put(1, "I");
		romans.put(2, "II");
		romans.put(3, "III");
		Set<Integer> keys =  romans.keySet();
		
		//IEnumerator in C#
		//Iterator is used to encapsulate the underlying collection
		Iterator<Integer> itr = keys.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		//Does not allow duplication
		Set<String> cities = new HashSet<>();
		cities.add("Pune");
		cities.add("Chennai");
		
		for (String city : cities) {
			System.out.println(city);
		}
		
		ArrayList<String> langs = new ArrayList();
		langs.add("Java");
		langs.add("C#");
		for (int i = 0; i < langs.size(); i++) {
			System.out.println(langs.get(i));
		}
		//for each
		for (String language : langs) {
			System.out.println(language);
		}
		
	}

}
