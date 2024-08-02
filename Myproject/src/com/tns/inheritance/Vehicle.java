package com.tns.inheritance;

public class Vehicle {
	void Vechile() {
		  String colour="Black",model="2024";
		  System.out.println(colour+model);
		   }
	
class Bike extends Vehicle{
	void bike() {
		String colour="Black",model="2024",brand="Pulsar";
		System.out.println(colour+model+brand);
	}
}
	
class car extends Vehicle {
	void car() {
		String brand="Thar",model="2024";
		String colour="Black";
		System.out.println(brand+model+colour);
		
	}
}

	public static void main(String[] args) {
		Vehicle a=new Vehicle();
		Bike b=a.new Bike();
		b.bike();
		car c=a.new car();
		c.car();
				

	}

}




	
		

	





	
     
   
    	
    	

  
    	
    	
    	
    



