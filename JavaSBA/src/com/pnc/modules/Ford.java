package com.pnc.modules;

public class Ford extends Car{
	int year;
	int manufacturerDiscount;
	
	public Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount) {
		super(speed, regularPrice, color);
		this.year = year;
		this.manufacturerDiscount = manufacturerDiscount;
		
	}
	
	@Override
	public double getSalePrice() {
		// for this method implement this: from the sale price computed from Car class, subtract the manufacturer Discount.
		return regularPrice - manufacturerDiscount;
			
	}

	@Override
	public String toString() {
		return "Ford [year=" + year + ", manufacturerDiscount=" + manufacturerDiscount + ", speed=" + speed
				+ ", regularPrice=" + regularPrice + ", color=" + color + "]";
	} 

}
