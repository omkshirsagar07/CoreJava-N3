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
		
		System.out.println(" the size of list one is :" +obj.size());
		System.out.println("Is list2 empty :"+ obj1.isEmpty());
		obj1.remove(1);
		System.out.println(obj1);
		System.out.println("does list2 contains three : "+obj1.contains("two"));
		System.out.println("element at the 1st index of list one : "+ obj1.get(1));
		System.out.println("index of five in list one :" + obj1.indexOf("five"));
		System.out.println("Last index of one : "+ obj1.lastIndexOf("one"));
		obj.clear();
		System.out.println(obj);
		
		
		List<Integer> obj2 = new ArrayList<Integer>();
		obj2.add(15);
		obj2.add(51);
		obj2.add(10);
		
		System.out.println("List 3 is : "+ obj2);
		
		//to sort obj2 in assending order
		Collections.sort(obj2);
		System.out.println("sorte obj 2 in ascending order : "+ obj2);
		//to sort obj2 in decending order
		Collections.reverse(obj2);
		System.out.println("sorte obj 2 in descending order : "+ obj2);
		
		
		
		
		
	}

}
