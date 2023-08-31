package com.proj.services;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCases {

	@Test
	public void mulTest0() {
		MulService mul = new MulService();
		int actual = mul.mul(100, 0);
		int expected = 0;
		assertEquals(expected, actual);
	}
	
	@Test
	public void mulTest1() {
		MulService mul = new MulService();
		int actual = mul.mul(100, 100);
		int expected = 10000;
		assertEquals(expected, actual);
	}
	
	
	@Test
	public void addTest0() {
		AddService add = new AddService();
		int actual = add.add(100, -100);
		int expected = 0;
		assertEquals(expected, actual);
	}
	
	@Test
	public void addTest1() {
		AddService add = new AddService();
		int actual = add.add(100, -180);
		int expected = -80;
		assertEquals(expected, actual);
	}
	
	
	@Test
	public void subTest0() {
		SubService sub = new SubService();
		int actual = sub.sub(100, -100);
		int expected = 200;
		assertEquals(expected, actual);
	}
	
	@Test
	public void subTest1() {
		SubService sub = new SubService();
		int actual = sub.sub(100, 100);
		int expected = 0;
		assertEquals(expected, actual);
	}
	
	
	@Test
	public void divTest0() {
		DivService div = new DivService();
		int actual = div.div(100, -100);
		int expected = -1;
		assertEquals(expected, actual);
	}
	
	@Test
	public void divTest1() {
		DivService div = new DivService();
		int actual = div.div(100, 0);
		int expected = Integer.MAX_VALUE;
		assertEquals(expected, actual);
	}
	
	@Test
	public void divTest2() {
		DivService div = new DivService();
		int actual = div.div(200, 100);
		int expected = 2;
		assertEquals(expected, actual);
	}

}
