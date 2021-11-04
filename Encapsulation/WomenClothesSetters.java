package com.xworkz.xworkz_java.Encapsulation;

public class WomenClothesSetters extends WomenClothes {
	private String color;
	private String name;
	private String type;
	private int size;
	private int Cost;
	WomenClothesSetters(){
		
	}
	public void setColor(String color) {
		if(color==null)
			return;
		this.color = color;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public void setCost(int cost) {
		Cost = cost;
	}
	
}
