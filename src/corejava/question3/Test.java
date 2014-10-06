package corejava.question3;

import java.util.HashMap;
import java.util.Map;

public class Test {
	
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		String str1 = "abc";
		String str2 = new String("abc");
		String str3 = "abc";
		map.put(str1, null);
		map.put(str2, null);
		map.put(str3, null);
		System.out.println(map.size());
	}

}

//0
//1 [CORRECT]
//2
//3