package com.packages.collections;
/*Given two hashmap h1 with employee id and designation 
 * and hashmap h2 with id and salary, 
 * in a new Haspmap the manager id and salary with the increment of 5000 has to added and printed.
Input: {1="analyst",2="manager"}
Input2:{1=2000,2=5000}
output:{2=10000}*/
import java.util.HashMap;
import java.util.Map;

public class HashMapExample2 {
	public static void main(String args[])
	{
		Map<Integer,String> map =new HashMap();
		map.put(1, "analyst");
		map.put(2, "developer");
		map.put(3, "tester");
		map.put(4, "manager");
		map.put(5, "president");
		map.put(6, "manager");
		
		Map<Integer,Integer> map1 =new HashMap();
		map1.put(1, 1000);
		map1.put(2, 500);
		map1.put(3, 300);
		map1.put(4, 1000);
		map1.put(5, 4000);
		map1.put(6, 3000);
		
		Map<Integer,Integer> map2 =new HashMap();
		
		for(Map.Entry<Integer, String> entry : map.entrySet())
		{
			if(entry.getValue().equals("manager"))
			{
				
				map2.put(entry.getKey(), map1.get(entry.getKey())+5000);
				
				
			}
		}
		
		
		for(Map.Entry<Integer, Integer> entry : map2.entrySet())
		{
		System.out.println("key: "+entry.getKey()+" Value: "+entry.getValue());
		}
		
		
	}

}
