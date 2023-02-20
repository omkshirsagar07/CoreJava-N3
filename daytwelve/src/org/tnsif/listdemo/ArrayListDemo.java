package org.tnsif.listdemo;

import java.util.*;
public class ArrayListDemo {

	public static void main(String[] args) {
			
		/*Collection is an interface we can't createb an obj to collection		 * */	
		//Collection obj<Object> = new Collection<>();
		
		Collection<Object> obj  = new ArrayList<>();
		
		obj.add(1);
		obj.add("two");
		obj.add("five");
		obj.add(1);
		System.out.println("First list is :"+obj);
		
		List<Object> obj1 = new ArrayList<Object>();
		obj1.addAll(obj);
		System.out.println("list two :" + obj1);
		
		
		
		
	}

}
