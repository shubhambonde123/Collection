package com.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


//2.Write a program to sort HashMap by key

public class SortHashmap_key {
	
	public static void main(String[] args) {
		HashMap< Integer, String> hm=new HashMap<Integer, String>();
		hm.put(1, "Sudarshan");
		hm.put(2, "Mantrash");
		hm.put(7, null);
		hm.put(3, "Himani");
		hm.put(9, "Bajirav");
		
		//System.out.println(hm);
		TreeMap<Integer, String> sortedMap = new TreeMap<>(hm);

        // Display the sorted entries
        for (Map.Entry<Integer, String> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
	}

}
