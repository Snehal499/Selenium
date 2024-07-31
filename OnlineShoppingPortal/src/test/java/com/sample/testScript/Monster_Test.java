package com.sample.testScript;

import org.testng.annotations.Test;

public class Monster_Test {
	@Test
	public void executionScript() {
		System.out.println("Hi");
		String browserName= System.getProperty("bname");
		System.out.println(browserName);
		
		String name= System.getProperty("user");
		System.out.println(name);
	}

}
