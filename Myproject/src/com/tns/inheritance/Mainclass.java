package com.tns.inheritance;

import com.tns.inheritance.StudentDemo.Firstyear;
import com.tns.inheritance.StudentDemo.Fourthyear;
import com.tns.inheritance.StudentDemo.Secondyear;
import com.tns.inheritance.StudentDemo.Thirdyear;
import com.tns.inheritance.StudentDemo.dept;

public class Mainclass {

	public static void main(String[] args) {

		StudentDemo a=new StudentDemo();
		a.college();
		dept b=a.new dept();
		b.Dept();
		Firstyear c=b.new Firstyear();
		c.first();
		Secondyear d=c.new Secondyear();
		d.second();
		Thirdyear f=d.new Thirdyear();
		f.third();
		Fourthyear e=f.new Fourthyear();
		e.four();


}
}