package com.packages.collections;
/*in a map, find the value corresponding to the largest key
	input{12:"hari",13:"krish",18:"mani"}
	output:,mani*/
import java.util.HashMap;
import java.util.Map;

public class LargestKey {
	
	public static void main(String args[])
	{
		Map <Integer,String> map =new HashMap();
		map.put(12, "Hari");
		map.put(13, "Krish");
		map.put(18, "Mani");
		
		Integer largestkey=0;
		
		for (Map.Entry<Integer,String> entry : map.entrySet())
        {
			if(entry.getKey()>largestkey)
			{
				largestkey=entry.getKey();
			}
        }
		
		System.out.println(map.get(largestkey));
	}

}
