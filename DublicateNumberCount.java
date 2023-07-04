package javaProject;

import java.util.HashMap;
import java.util.Map;

public class DublicateNumberCount {
	public static void main(String[] args) {
		/*map.put(1, 1);
		map.put(2, 1);
		map.put(5,0);
		System.out.println(map.get(5));
		System.out.println(map.containsKey(5));
		System.out.println(map);*/
		
		int a[] = { 1, 2, 5, 3, 4, 5, 4, 5, 2, 0, 1, 6, 2, 5, 1, 7 };
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < a.length; i++) {
			if (map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i]) + 1);
			} else {
				map.put(a[i], 1);
			}
		}
		System.out.println(map);
	}
}