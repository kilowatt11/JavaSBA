package com.pnc;

import com.pnc.modules.Car;
import com.pnc.modules.Ford;
import com.pnc.modules.Sedan;

public class MyOwnAutoShop {

	public static void main(String[] args) {

		//instantiate Sedan and show sales price
		System.out.println("Sedan");
		Sedan lexus = new Sedan(150, 2000d, "Red", 15);
		System.out.println(lexus.toString());
		System.out.println("Sales Price = " +lexus.getSalePrice());
		
		//instantiate 2 ford instances and display sales price
		System.out.println("\nford1");
		Ford ford1 = new Ford(175, 2500, "Black", 2021, 200);
		System.out.println(ford1.toString());
		System.out.println("Sales Price = " +ford1.getSalePrice());
		
		System.out.println("\nford2");
		Ford ford2 = new Ford(135, 3000, "Grey", 2020, 200);
		System.out.println(ford2.toString());
		System.out.println("Sales Price = " +ford2.getSalePrice());
		
		//instantiate Car and display sales price
		System.out.println("\ncar");
		Car car = new Car(100, 3000,"Silver");
		System.out.println(car.toString());
		System.out.println("Sales Price = " +car.getSalePrice());
		
	}

}
