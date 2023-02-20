package org.tnsif.listdemo;

import java.util.*;

// demonstration on VEctor
public class VectorDemo {

	public static void main(String[] args) {
		
		Vector<Object> obj = new Vector<Object>();
		obj.add(101);
		obj.add("two");
		obj.add("five");
		obj.add(1);
		System.out.println("list two :" + obj);
		
		System.out.println(" the size of list one is :" +obj.size());
		System.out.println("Is list2 empty :"+ obj.isEmpty());
		obj.remove(1);
		System.out.println(obj);
		System.out.println("does list2 contains three : "+obj.contains("two"));
		System.out.println("element at the 1st index of list one : "+ obj.get(1));
		System.out.println("index of five in list one :" + obj.indexOf("five"));
		System.out.println("Last index of one : "+ obj.lastIndexOf("one"));
		//obj.clear();
		System.out.println(obj);
		
		for(Object a : obj)
		{
			System.out.print(a+" ");
		}
		
		Vector<Integer> obj2 = new Vector<Integer>();
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
