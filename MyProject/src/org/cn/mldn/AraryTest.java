package org.cn.mldn;

import java.util.Arrays;
class Student {
	private static long counter;
	private final long id = counter++;
	// private final int age=10;
	public String toString() {
		return "student'id=" + id;
	}
}

public class AraryTest {
	public static void main(String args[]) {
		Student[] a;
		Student[] b = new Student[5];
		System.out.println("b:" + Arrays.toString(b));
		// System.out.println("b:"+b);
		Student[] c = new Student[4];
		for (int i = 0; i < c.length; i++) {
			if (c[i] == null) {
				c[i] = new Student();
			}
		}
		Student[] d = { new Student(), new Student(), new Student() };
		a = new Student[] { new Student(), new Student() };
		System.out.println("a.length==" + a.length);
		System.out.println("b.length==" + b.length);
		System.out.println("c.length==" + c.length);
		System.out.println("d.length==" + d.length);

		a = d;
		System.out.println("a.length==" + a.length);

		int[] e;
		int[] f = new int[3];
		System.out.println("f:" + Arrays.toString(f));
		int[] g = new int[4];
		for (int i = 0; i < g.length; i++) {
			g[i] = i * i;
		}
		int[] h = { 1, 2, 3 };
		System.out.println("f.length==" + f.length);
		System.out.println("g.length==" + g.length);
		System.out.println("h.length==" + h.length);

		e = h;
		System.out.println("e.length==" + e.length);
		e = new int[] { 1, 2 };
		System.out.println("e.length==" + e.length);

	}
}
