package com.pnc.modules;

public class Sedan extends Car{
	
	int length;
	
	public Sedan(int speed, double regularPrice, String color, int length){
		super(speed,regularPrice,color);
		this.length = length;
	}
	
	@Override
	public double getSalePrice() {
		// for this method implement this: If length>20 feet, 5%discount, Otherwise, 10%discount
		double discount = 0d;
		
		if(this.length > 20) {
			discount = regularPrice - (regularPrice *.05);
		}else {
			discount = regularPrice - (regularPrice *.20);
		}
		return discount;
	}

	@Override
	public String toString() {
		return "Sedan [length=" + length + ", speed=" + speed + ", regularPrice=" + regularPrice + ", color=" + color
				+ "]";
	} 
	
}
