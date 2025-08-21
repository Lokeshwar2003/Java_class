import java.util.*;

public class Main {
    public static void main(String[] args) {
      //add operater
      int x, y;
      x = y = 50;
      System.out.println(x+y);
      
      //sum operater
      int a = 25, b = 50;
      System.out.println(a - b);
      
      //mult operater
      Double m = 5.55d;
      Float n = 6.66f;
      System.out.println(m * n);
      
      //div operater
      System.out.println(x / y);
      
      //mod operater
      System.out.println(a % b);
      
      //increment operater
      x = ++x;
      System.out.println(x);
      
      //decrement operater
      y = --y;
      System.out.println(y);
      
      //add 10
      x += 10;
      System.out.println(x);
      
      //sum 10
      x -= 10;
      System.out.println(x);
      
      // mult 10
      x *= 10;
      System.out.println(x);
      
      // div 10
      x /= 10;
      System.out.println(x);
      
      // mod 10
      x %= 10;
      System.out.println(10);
      
      x |= 10;
      System.out.println(10);
      
      //squ 10
      x ^= 10;
      System.out.println(10);
      
      x >>= 10;
      System.out.println(10);
      
      x <<= 10;
      System.out.println(10);
      
      //equal
      System.out.println(x==y);
      
      //not equal
      System.out.println(x!=y);
      
      //Greater That 
      System.out.println(x>y);
      
      //Less than 
      System.out.println(x<y);
      
      //Greater than equal
      System.out.println(x >= y);
      
      //Less than equal 
      System.out.println( x <= y);
      
      //and operater
      System.out.println(x> y && x < y);
      
      //or operater
      System.out.println(x > y || x < y);
      
      //not operater
      System.out.println(!(x == y));
  }
}