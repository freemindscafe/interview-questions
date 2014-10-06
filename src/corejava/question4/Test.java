package corejava.question4;

import java.util.HashMap;
import java.util.Map;

public class Test {
	
	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		Object obj3 = obj1;
		Object obj4 = obj1;
		Map<Object, String> map = new HashMap<>();
		map.put(obj1, null);
		map.put(obj2, null);
		map.put(obj3, null);
		map.put(obj4, null);
		System.out.println(map.size());
	}

}

//0
//1
//2 [CORRECT]
//3