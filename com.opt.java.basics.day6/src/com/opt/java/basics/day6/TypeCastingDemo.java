package com.opt.java.basics.day6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.CharBuffer;

// type casting ==. converstion of one data type of another
// in java, we have 8 primitive data types
// byte short char int float long double and boolean
// string is considered as class in java
// obj is a super class of classes in java
// 3 types of casting 
//a)implicit and explicit casting
//b) upcasting and downcasting 
//c) Autoboxing and unboxing 


//implicit and explicit casting Demo

class Example1{
	void showExample() {
		int number1=20;
		long number2 = number1; //implicit  casting done by JVM
		
		
		double number3= 20.6969;
		float number4 =(float) number3;  //explicit casting done by developer
		
		System.out.println(number4);
	}
}

//implicit less memory to higher memory 
//explicit means higher to less memory 

//upcasting and down casting (child to parent)
class Example2{
	void showExample() {
		String name1= "JJJJ";
		Object name2= name1;
	System.out.println("name2");
	
	Object name3= "PT";
	String name4= (String) name3; //adding cast to string 
	System.out.println(name4);
	
	}
	//
//autoboxing and unboxing
	// Primitive data types => // byte short char int float long double and boolean	
	// Wrapper class ==> Byte Show Character Integer Float Long Double Boolean *First letter Caplital		
				//genrics and framework* only accepts class
	
}				

class Example3{
	void showExample() throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("your age");
	
		int age = Integer.parseInt(br.readLine());
		System.out.println(age);
	}
}

public class TypeCastingDemo {


	public static void main(String[] args) throws IOException {
Example3 ref =new Example3();
ref.showExample();
	}

}
