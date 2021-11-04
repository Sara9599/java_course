package com.xworkz.xworkz_java.Encapsulation;

public class JavaBean {
 public static void main(String[] args)
 {
	 Mobile mobile=new Mobile();
	 mobile.setBrand("Nokia");
	 mobile.setCamera("12pxl");
	 mobile.setPrice(15000.20);
	 mobile.setRamSize(4);
	 
	 System.out.println(mobile.getBrand());
	 System.out.println(mobile.getCamera());
	 System.out.println(mobile.getPrice());
	 System.out.println(mobile.getRamSize());
	 
	 
	 WomenClothesSetters cloth=new WomenClothesSetters();
	 cloth.setColor("black");
	 cloth.setCost(10000);
	 cloth.setName("tops");
	 cloth.setSize(36);
	 cloth.setType("western");
	 
	 
	 System.out.println(cloth.getColor());
	 System.out.println(cloth.getCost());
	 System.out.println(cloth.getName());
	 System.out.println(cloth.getSize());
	 System.out.println(cloth.getType());
 }
}
