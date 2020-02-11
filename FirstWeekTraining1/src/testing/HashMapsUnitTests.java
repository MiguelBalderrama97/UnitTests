package testing;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;


import org.junit.jupiter.api.Test;

import models.Employee;

class HashMapsUnitTests {

	@Test
	void checkSize() {
		Map<String, Employee> employees = new HashMap<>();
		employees.put("Uno", new Employee(1, "Mike"));
		employees.put("Dos", new Employee(2, "Carlos"));
		employees.put("Tres", new Employee(3, "Juan"));
		employees.put("Cuatro", new Employee(4, "Luis"));
		employees.put("Cinco", new Employee(5, "Leo"));
		employees.put("Seis", new Employee(6, "David"));
		employees.put("Seis", new Employee(6, "David"));
		employees.put(null, new Employee(6, "David"));
		employees.put(null, new Employee(6, "David"));
		
		System.out.println("Test 1: "+employees.size());
		assertEquals(7, employees.size());
	}
	
	@Test
	void replace() {
		Map<String,Integer> map = new HashMap<String,Integer>();
		assertEquals(null, map.put("a", 9));
		assertEquals(null, map.put("b", 8));
		assertEquals(null, map.put("c", 7));
		assertEquals(null, map.put("d", 6));
		assertEquals(null, map.put("e", 5));
		assertEquals(null, map.put("f", 4));
		assertEquals(null, map.put("g", 3));
		assertEquals(null, map.put("h", 2));
		assertEquals((Integer)9, map.put("a", 0));
		assertEquals((Integer)8, map.put("b", 1));
		assertEquals((Integer)7, map.put("c", 2));
		assertEquals((Integer)6, map.put("d", 3));
		assertEquals((Integer)5, map.put("e", 4));
		assertEquals((Integer)4, map.put("f", 5));
		assertEquals((Integer)3, map.put("g", 6));
		assertEquals((Integer)2, map.put("h", 7));
		
		System.out.println("Test 2: "+map.size());
	}
	
	@Test
	void checkBucket() {
		Map<String, Employee> employees = new HashMap<>();
		String[] keys = {"Cuatro", "Cinco", "Seis"};
		employees.put(keys[0], new Employee(4, "Luis"));
		assertEquals(2, keys[0].hashCode()&15);
		employees.put(keys[1], new Employee(5, "Leo"));
		assertEquals(4, keys[1].hashCode()&15);
		employees.put(keys[2], new Employee(6, "David"));
		assertEquals(12, keys[2].hashCode()&15);
		employees.put(keys[2], new Employee(6, "David"));
		assertEquals(12, keys[2].hashCode()&15);
		employees.put(null, new Employee(6, "David"));
		System.out.println("Test 3: "+employees.size());
	}
	
	@Test
	void compare() {
		Map<String, Employee> employees1 = new HashMap<>();
		Map<String, Employee> employees2 = new HashMap<>();
		
		employees1.put("Dos", new Employee(3, "David"));
		employees1.put("Seis", new Employee(1, "Mike"));
		employees1.put(null, new Employee(4, "Leo"));
		employees1.put(null, new Employee(8, "David2"));
		employees1.put("Nueve", null);
		
		employees2.put("Dos", new Employee(3, "David"));
		employees2.put("Seis", new Employee(1, "Mike"));
		employees2.put(null, new Employee(4, "Leo"));
		employees2.put(null, new Employee(8, "David2"));
		employees2.put("Nueve", null);
		
		//boolean equals = employees1.equals(employees2); -> true
		boolean equals = employees1.get("Dos") == (employees2.get("Dos"));
		
		assertEquals(false, equals);
	}
	
	@Test
	void iterator() {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Geeks"); 
	    map.put(2, "ForGeeks"); 
	    map.put(3, "GeeksForGeeks"); 
	    int keyToBeChecked = 2; 
	    System.out.println("HashMap: "+map);  
	    
	    Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator(); 

	    boolean isKeyPresent = false; 
	
	    while (iterator.hasNext()) { 
	
	        Map.Entry<Integer, String> entry = iterator.next(); 

	        if (keyToBeChecked == entry.getKey()) { 
	            isKeyPresent = true; 
	        } 
	    } 
 
	    assertEquals(true, isKeyPresent);
	}
	

}
