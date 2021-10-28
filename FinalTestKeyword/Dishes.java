package com.xworkz.xworkz_java.FinalTestKeyword;

final public class Dishes {
	final void cook() //final method
	{
		System.out.println("cooking");
	}
public static void main(String[] args)
{
	final String name="Biryani";//final variable
	Dishes dish=new Dishes();
	dish.cook();
	System.out.println(name);
	
	
}
}
