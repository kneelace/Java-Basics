
package com.lti.day1.client;

import com.lti.day1.basic.Person;


public class PersonClient {
	public static void main(String[] args) {
		System.out.println("Welcome to Person App....");
		//cltr+space
		//how to create objects in java
		Person p1 = new Person();
		//constructor
		System.out.println(p1);
		//whenever we try to print an object
		//callback is made to toString method
		Person p2 = new Person(101, "Alice", "Khan", "alice@gmail.com", "9879879876");
		System.out.println(p2);
		p2.print();
		Person p3 = new Person("Alice", "Bob", "alice@gmail.com", "9998887776");
		p3.print();
	}
}
