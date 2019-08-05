package p154;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.stream.Stream;

public class Map {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("1", "Haeun");
		map.put("2", "Lee");
		map.put("3", "kim");
		
		Stream<Entry<String, String>> stream =map.entrySet().stream();	
		stream.forEach(e -> System.out.println(e.getKey() + ":" + e.getValue()));
	}

}
