package org.tnsif.listdemo;


import java.util.*;
public class StackDemo {

	public static void main(String[] args) {

		Stack<String> s = new Stack<>();
		
		s.push("Shital");
		s.push("hetal");
		s.push("mittal");
		s.push("Little");
		
		System.out.println("the Element in side the stack is : "+s);
		System.out.println(s.pop());
		System.out.println("the Element in side the stack is : "+s);
		
	 }

}
