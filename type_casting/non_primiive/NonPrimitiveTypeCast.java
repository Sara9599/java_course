package com.xworkz.xworkz_java.type_casting.non_primiive;

public class NonPrimitiveTypeCast {
public static void main(String[] args)
{
	Laptop laptop=new Dell();//upcasting
	laptop.name="dell";
	Dell dell=(Dell)laptop;//down casting
	dell.price=10000;
    System.out.println(dell.name);
    System.out.println(dell.price);
    
}
}
