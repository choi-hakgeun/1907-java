package h_api;

import java.util.HashMap;

public class KeyExam {
		

	public static void main(String[] args) {
		HashMap<Key, String> map = new HashMap<Key, String>();
		map.put(new Key(1), "¹ë·ù°ª");
		map.put(new Key(2), "¹ë·ù°ª2");
		
		map.put(new Key(1), "¹ë·ù°ª3");
		String value = map.get(new Key(1));
		
		System.out.println(value);
		
	}

}
