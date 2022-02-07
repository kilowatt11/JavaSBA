package com.pnc.modules;

public class Truck extends Car{
	
	int weight;
	public Truck(int speed, double regularPrice, String color, int weight) {
		super(speed, regularPrice, color);
		this.weight = weight;
	}

	@Override
	public double getSalePrice() {
		// for this method implement this: If weight>2000, 10%discount. Otherwise, 20%discount.
		double salesPrice = 0d;
		if(this.weight > 2000) {
			salesPrice = regularPrice - (regularPrice * .10);
		}else {
			salesPrice = regularPrice - (regularPrice * .20);
		}
		return salesPrice;
		
	}

	@Override
	public String toString() {
		return "Truck [weight=" + weight + ", speed=" + speed + ", regularPrice=" + regularPrice + ", color=" + color
				+ "]";
	} 
}
