package com.tns.inheritance;

public class StudentDemo {
	void college() {
		String name="Roever";
		int id=8153;
		System.out.println(name+id);
		
	}
	
	class dept extends StudentDemo{
		void Dept() {
			String name="CSE";
			int year=4;
			System.out.println(name+year);
		}
	}
	class Firstyear extends dept {
		void first() {
			String subject="English";
			int rollno=1000;
			System.out.println(subject+rollno);
					
		}
	}
	class Secondyear extends dept{
		void second() {
			String subject="Tamil";
			int rollno=2000;
			System.out.println(subject+rollno);
					
		}
	}
	class Thirdyear extends dept{
		void third() {
			String subject="Maths";
			int rollno=3000;
			System.out.println(subject+rollno);
					
		}
	}
	class Fourthyear extends dept{
		void four() {
			String subject="English";
			int rollno=5000;
			System.out.println(subject+rollno);
		}
	}
	
}