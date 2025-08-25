import java.util.*;

public class Main {
  int x = 10;
  static void myMethod(){
    System.out.println("I just got executed!...");
  }
  
  static void myMethod1(String fname, int age){
    System.out.println(fname + "Reddy" + age);
  }
    public static void main(String[] args) {
      myMethod();
      myMethod();
      myMethod();
      
      myMethod1("Raman ", 30);
      myMethod1("Ram ", 40);
      myMethod1("kumar ", 20);
      
      //instance variables
      Main t = new Main(); //create in object
      System.out.println(t.x);
      t.instanceMethod(); //create method
      returnvalues.myMethod();
      
      //java scope variable
      //variables are only accessible inside the region where they are created. This is called scope
      scopeVariables.myMethod();
  }
  public void instanceMethod(){
    System.out.println(x);
  }
}

class returnvalues{
  // return value insert of void.
  // void return null
  /*If you want the method to return a value, 
  you can use a primitive data type (such as int, char, etc.) 
  instead of void, and use the return keyword inside the method */
  
  static float add(int x, float y) {
    return x + y;
  }
  
  static double add(double x, double y) {
    return x + y;
  }
  
  static void myMethod() {
    System.out.println(add(10, 20.50f));
    
    //method Overloading in static method
    Double myMethod = add(4.77d, 7.99d);
    System.out.println(myMethod);
    
    //other way create object or instance method
    
    SecondMain x = new SecondMain(); //create a object
    System.out.println("object: " + x.sumofnum(30, 20));
  }
}

class SecondMain {
  int sumofnum(int a, int b){
    return a + b;
  }
}

//------------------------------------------------scope

class scopeVariables {
  static void myMethod(){
    // method scope
    ScopeMethod.method();
    
    // Block Scope
    //A block of code refers to all of the code between curly braces { }.
    BlockScope.method();
    
    //loop Scope
    //Variables declared inside a for loop only exist inside the loop
    LoopScope.method();
    
    //Class Scope
    /*Variables declared inside a class but outside any method have class scope (also called fields). 
    These variables can be accessed by all methods in the class */
    ClassScope.method();
  }
}

class ScopeMethod {
  public static void method(){
    // Code here CANNOT use x it will show error

    int x = 100;

    // Code here CAN use x
    System.out.println(x);
  }
}

class BlockScope {
  // defined public ok..
  static void method(){
    // Code here CANNOT use x

    { // This is a block

      // Code here CANNOT use x

      int x = 100;

      // Code here CAN use x
      System.out.println(x);

    } // The block ends here

    // Code here CANNOT use x
  }
}

class LoopScope {
  static void method(){
    for (int i = 0; i < 5; i++) {
      System.out.println(i); // i is accessible here
    }

    // i is NOT accessible here
  }
}

class ClassScope {
  
  int x = 5; // Class variable
  
  public static void method(){
    ClassScope myObj = new ClassScope();
    System.out.println(myObj.x); // Accessible here
  }
}
