package org.cn.vo.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringDemoTest {
	private StringDemo demo=new StringDemo("1111");
	@Test
	public void testValidate() {
		demo.validate();
	}

	@Test
	public void testPrintlnString() {
		demo.println("liurong");
	}

}
