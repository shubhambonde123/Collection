package com.demo;

import java.security.Key;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;


//1.Write a program to iterate the HashMap

public class Iterate_Hashmap {
	public static void main(String[] args) {
		
		
		
		Map<Integer, String> m=new HashMap<Integer, String>();
		m.put(1,"Shubham");
		m.put(2, "Prajwal");
		m.put(3,"Rohit");
		m.put(4, "Prajwal");
		
		
		System.out.println(m);
		
		Iterator<Integer> it=m.keySet().iterator();
		while(it.hasNext()) {
			 int key=(int)it.next();
			 System.out.println("Id = "+key+ "	 name=  "+m.get(key));
		}
		
		
		
		//sample output
		//System.out.println(1+2+3+5+6+"welcome");
		}

}
