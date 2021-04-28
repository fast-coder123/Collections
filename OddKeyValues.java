package com.packages.collections;

import java.util.HashMap;
import java.util.Map;

/*avg of odd key values in hash map.
	input1-> {1:4,2:7,3:8,4:6}
	output-> (4+8)/2 = 6*/

public class OddKeyValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map <Integer,Integer> map =new HashMap();
		map.put(1, 4);
		map.put(2, 7);
		map.put(3, 8);
		map.put(4, 6);
		
		int oddKeyValues=0;
		for(Map.Entry<Integer,Integer> entry : map.entrySet())
		{
			if(entry.getKey()%2!=0)
			{
				System.out.println("key: "+entry.getKey() +" value "+ entry.getValue());
				oddKeyValues= oddKeyValues+entry.getValue();
			}
		}
		System.out.println("total of values of Odd keys "+oddKeyValues);
		
		

	}

}
