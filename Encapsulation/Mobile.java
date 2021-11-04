package com.xworkz.xworkz_java.Encapsulation;

public class Mobile {
	private String Brand;
	private double price;
	private int ramSize;
	private String camera;
	public Mobile() {
		
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		if(brand==null) {
			return;
		}
		Brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getRamSize() {
		return ramSize;
	}
	public void setRamSize(int ramSize) {
		this.ramSize = ramSize;
	}
	public String getCamera() {
		return camera;
	}
	public void setCamera(String camera) {
		this.camera = camera;
	}
	
	
}
