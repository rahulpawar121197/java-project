package com.text.Super;

public class ThisKeyword


{
int a;
int b=10;
String name="Rahul";
public ThisKeyword() {
	
	
	
	m1();
}

public  void m1() {
int c=this.a;
	System.out.println("this is m1 from parent class");
	
	
}


void  m3() {
	
	
	this.m1();
	
}


}
