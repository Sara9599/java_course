package com.xworkz.xworkz_java.type_casting.primitive1;

public class PrimitiveType1 {
public static void main(String[] args) {
	//implicit
	int i=20;
	long l=i;
	System.out.println(l);
	
	//explicit
	double d=1000.00000d;
	short s=(short)d;
	System.out.println(s);
	
	//ascii conversion
	char c='a';
	int x=(int)c;
	double dl=(double)c;
	System.out.println(x);
	System.out.println(dl);
}
}
