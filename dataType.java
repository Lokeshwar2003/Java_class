import java.util.*;

public class Main {
    public static void main(String[] args) {
      System.out.println("Hello, World!");
      // byte 1 byte
  		byte mynum = 100;
  		System.out.println(mynum);
  		
  		// short 2 byte
  		short mynum0 = 5000;
  		System.out.println(mynum0);
  		
  		// int 4 byte
  		int mynum1 = 1000000;
  		int mynum11 = 0xFACE;
  		System.out.println(mynum1);
  		
  		//long 8 byte
  		long mynum2 = 10000000000L;
  		System.out.println(mynum2);
  		
  		//float 4 byte
  		float mynum3 = 4.677f;
  		System.out.println(mynum3);
  		
  		//double 8 byte
  		double mynum4 = 5.097950d;
  		System.out.println(mynum4);
  		
  		//char 2 byte
  		char char0 = 'B';
  		char char1 = 65;
  		System.out.println(char1);
  		
  		//String non-primitive
  		String greeting = "Hello World...";
  		System.out.println(greeting);
  		String bio = """
  				Name: Lokeshwar
  				Age: 22
  				""";
  		System.out.println(bio);
  		
  		//boolean true/false
  		boolean isJavaFun = true;
  		System.out.println(isJavaFun);
  		variables();
  }
  
  public static void variables() {
		//Create variables of different data types
		int items = 50;
		float costPerItem = 9.99f;
		float totalCost = items * costPerItem;
		char currency = '$';
		
		//pirnt variables
		System.out.println("Total cost =" + totalCost + currency);
		widening();
	}
	
	public static void widening() {
		//byte -> short -> char -> int -> long -> float -> double
		int myInt = 9;
		double myDouble = myInt;
		System.out.println(myDouble);
		
		narrowing();
	}
	
	public static void narrowing() {
		// double -> float -> long -> int -> char -> short -> byte
		double myDouble = 9.85d;
		int myInt = (int) myDouble;
		System.out.println(myInt);
	}
}