package com.pnc;

import com.pnc.modules.Car;
import com.pnc.modules.Ford;
import com.pnc.modules.Sedan;

public class MyOwnAutoShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Sedan");
		Sedan lexus = new Sedan(150, 2000d, "Red", 15);
		System.out.println("Sales Price = " +lexus.getSalePrice());
		
		System.out.println("ford1");
		Ford ford1 = new Ford(175, 2500, "Black", 2021, 200);
		System.out.println("Sales Price = " +ford1.getSalePrice());
		
		System.out.println("ford2");
		Ford ford2 = new Ford(135, 3000, "Grey", 2020, 200);
		System.out.println("Sales Price = " +ford2.getSalePrice());
		
		Car car = new Car(100, 3000,"Silver");
		System.out.println("Sales Price = " +car.getSalePrice());


	}

}