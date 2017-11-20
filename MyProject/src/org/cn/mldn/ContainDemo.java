package org.cn.mldn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Person {
	private static long counter;
	private final long id = counter++;

	public String toString() {
		return "person's id=" + id;
	}

	public Person() {
		System.out.println("counter==>" + counter);
		System.out.println("id==>" + id);
	}
}

public class ContainDemo {
	public static void main(String args[]) {
		Person[] persons = new Person[10];
		for (int i = 0; i < 5; i++) {
			persons[i] = new Person();
		}
		System.out.println(persons.length);
		System.out.println(Arrays.toString(persons));
		System.out.println(persons[3]);

		List<Person> list = new ArrayList<Person>();
		for (int i = 0; i < 5; i++) {
			list.add(new Person());
		}
		System.out.println(list);
		System.out.println(list.get(2));

		int[] integer = { 1, 2, 3, 34, 4, 5 };
		System.out.println(Arrays.toString(integer));
		System.out.println(integer[4]);

		List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
		list2.add(100);
		System.out.println(list2);
		System.out.println(list2.get(2));

	}
}
