package com.xworkz.xworkz_java.Abstraction.abstract_class;

public class AbstractClassDemo {
public static void main(String[] args)
{
	//Hero hero=new Honda()this can be done as  parent reference to child object bcoz cannot create the object for abstract method.
	System.out.println("honda.......");
	Honda honda=new Honda();
	honda.engine();
	honda.body();
	
	System.out.println("microsoft.....");
	Microsoft microsoft=new Microsoft();
	microsoft.upArrow();
	microsoft.downArrow();
	microsoft.leftArrow();
	microsoft.rightArrow();
	
	
	System.out.println("biscuits......");
	VetaMarigold vm=new VetaMarigold();
	vm.Design();
	vm.quantity();
	vm.price();
	vm.quality();
}
}
