package com.xworkz.xworkz_java.type_casting.non_primitive1;

public class NonPrimitive {
public static void main(String[] args)
{
	SmartPhone smartphone=new Moto();
	smartphone.name="Moto";
	smartphone.price=20000;
	Moto moto=(Moto)smartphone;
	moto.color="black";
	System.out.println(moto.color);
	System.out.println(smartphone.name);
	System.out.println(smartphone.price);
	
	
}
}
