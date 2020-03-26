package com.opt.java.basics.day6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Type casting ==> Conversion of one data type of another
// In Java, we have 8 primitive data types
// byte, short, long, char, int, float, long, double and boolean
// String is consider as a class in Java
// Object is a super class of all the classes in Java

// 3 different types of casting
// a) implicit and explicit casting
// b) Upcasting and Downcasting
// c) Autoboxing and Unboxing


// implicit casting and explicit casting 

class Example1{
	void showExample() {
		int number1 =20;
		long number2 = number1; // implicit casting (less memory to higher memory) done by JVM
		double number3 = 20.00;
		float number4 = (float) number3; // explicit (higher memory to less memory) casting done by Developer
		
		System.out.println(number4);
		
	}// end of showExample1
} // end of Example1


//Up casting and Down casting

class Example2{
	void showExample() {
		String name1 = "John";
		Object name2 = name1; // Up casting done by JVM (child to parent conversion) // Object --> parent , String --> child
		
		System.out.println(name2);
		
		Object name3 = "Shakti";
		String name4 = (String) name3; // down casting done by Developer (parent to child conversion)
		
	} // end of showExample2
}// end of Example2

// Primitive Data Types in Java ==> byte, short, long, char, int, float, long, double and boolean
// Wrapper classes in Java 		==> Byte, short, Character, Integer, Float, Long, Double, Boolean (In captial letters) 
// Collection framework does not support any data types, but only class and objects

class Example3{
	
	void showExample() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//System.out.println("enter your name : ");
		System.out.println("enter your age : ");
		
		//char name [] =  new char [20];
		
		
		  String name = br.readLine();
		  
		 System.out.println(name.charAt(2));
		 
		
			int age =  Integer.parseInt(br.readLine()) ; // floatParsefloat ,doubleParsedouble // auto boxing , unboxing 
			System.out.println(age);
		
	
	}
	
}// end of Example3


public class TypeCastingDemo {

	public static void main(String[] args) throws IOException {
		Example3 ref = new Example3();
		ref.showExample();

	}

}
