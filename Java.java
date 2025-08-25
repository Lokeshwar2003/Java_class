import java.util.*;

public class Main {
    public static void main(String[] args) {
      System.out.println("Hello, World!");
      tenmain.data();
  }
}

class Secondmain {
    public void greet() {
        System.out.println("Hello from secondmain!");
    }
}
class tenmain {
    public static void data() {
        System.out.println("Hello Word!");
        System.out.println("I am learning java.");
        System.out.println("It is awesome!");
        System.out.print("lokeshwar ");
        System.out.print("Reddy");
        System.out.println(42190);
        System.out.println(20+ 2 * 9);
        //test comment single line
        /* hi how are you
        how is going java*/
        secondmain();
    }
    
    public static void secondmain() {
        System.out.println("hello");
        String First_name = "Lokeshwar Reddy";
        String Last_name = "Mondem";
        String Full_name = First_name + Last_name;
        int age = 22;
        float cgpa = 7.03f;
        boolean Graduate = true;
        System.out.println(String.format("Hello, %s %s! YOu are %d years old. ", First_name, Last_name, age));
        System.out.printf("Hello, %s! YOu are %d years old.%n", Full_name, age);
        threemain();
    }
    
    public static void threemain() {
        String bio = """
            Name: Lokeshwar Reddy
            Age: 22
            CGPA: 7.03
            Graduate: true
            """;
        
        System.out.println(bio);
        Secondmain obj = new Secondmain();
        obj.greet();
        fourmain.check();
        findarea.totalarea();
    }
}

class fourmain {
    public static void check(){
        System.out.println("checkmate");
    }
}

class findarea {
    public static void totalarea() {
        int length = 4;
        int width = 6;
        int area;
        
        area = length * width;
        
        System.out.println("Total area is: " + area );
        
        javaString.stringMethod();
    }
}

class javaString {
  public static void stringMethod() {
    String txt = "QWERTYUIOPASDFGHJKLZXCVBNM";
    
    //Length()
    System.out.println("Totel length:" + txt.length());
    
    //toLowerCase()
    System.out.println(txt.toLowerCase());
    
    //toUpperCAse()
    System.out.println(txt.toUpperCase());
    
    //indexof()
    System.out.println(txt.indexOf("A"));
    
    //concat()
    System.out.println("hi.." + txt);
    System.out.println("hi..".concat(txt));
    
    //Special Character
    String txt1 = "Hi \"Lokesh\"war Reddy it\'s\\";
    System.out.println(txt1);
    
    math();
  }
  
  public static void math() {
    //find lowest value
    System.out.println(Math.min(5, 10));
    
    //find square root 
    System.out.println(Math.sqrt(4));
    
    //returns positive
    System.out.println(Math.abs(-6.8));
    
    //randomNum
    int randomNum = (int) (Math.random() * 101);
    System.out.println(randomNum);
  }
}
