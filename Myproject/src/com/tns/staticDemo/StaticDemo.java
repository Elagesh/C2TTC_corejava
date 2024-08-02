package com.tns.staticDemo;

public class StaticDemo {
	static {
		System.out.println("main StaticBlock");
	}
	public static void main(String[] args) {
		StaticBlock s=new StaticBlock();
		s.display();
		}
		

	}


