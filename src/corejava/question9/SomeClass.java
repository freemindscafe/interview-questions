package corejava.question9;

import java.util.IdentityHashMap;
import java.util.Map;

public class SomeClass {


public static void main(String[] args) {

final Map<String, Integer> map = new IdentityHashMap<>();

final String key = new String("KEY");

map.put(key, 1);

System.out.print(map.get(key));

printAndSet(map);

System.out.print(map.get(key));

}


public static void printAndSet(final Map<String, Integer> map) {

final String key = new String("KEY");

map.put(key, 2);

System.out.print(map.get(key));

}

}

//122
//112
//111
//121 [CORRECT]

