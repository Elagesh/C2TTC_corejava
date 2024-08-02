package com.tns.dayten.exception;

public class Service {
	
	void add(int a) {
		System.out.println(a);
	}
	static void validateMark(int mark) throws InvalidMarkException{
		if(mark<0 || mark>100) {
			throw new InvalidMarkException("Mark should be between 0 and 100");
		}
	}
	
	public static void main(String[] args) {
		int mark = 190;
		Service s = new Service();
		s.add(mark);
		try {
			Service.validateMark(mark);
		} catch (InvalidMarkException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			
			//ArithmeticException
		}
	}

}
