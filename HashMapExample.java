package com.packages.collections;

/*1. HashMap with regnum as key and mark as value. find the avg of marks whose key is odd.
input:{12:90,35:90,33:90,56:88}
output:avg of(90+90) =90

 * */
//import java.lang.Integer;
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	public static void main(String args[])
	{
		HashMap <Integer, Integer> map = new HashMap<>();
		map.put(12, 90);
		map.put(35, 90);
		map.put(33, 90);
		map.put(56, 88);
		float total=0;
		int numberOfTotals=0;
		
		// using for-each loop for iteration over Map.entrySet()
        for (Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            //System.out.println("Key = " + entry.getKey() +
            //                 ", Value = " + entry.getValue());
        	
        	System.out.println("Key = " + (entry.getKey()%2) );
            
            if((entry.getKey()%2)!=0)
            {
            	System.out.println("Key = " + entry.getKey() +
                        ", Value = " + entry.getValue());
            	total= total+entry.getValue();
            	numberOfTotals=numberOfTotals+1;
            }
        }
        
        System.out.println("total"+total);
        
        System.out.println("average of marks: "+(total/numberOfTotals));
		
		
		
		
		
		
	}

}
