import java.util.*;

public class Main {
    public static void main(String[] args) {
      String[] cars = new String[4];
      cars[0] = "Volve";
      cars[1] = "BMW";
      cars[2] = "Ford";
      cars[3] = "Mazda";
      System.out.println(cars);
      
      int[] myNum = {10, 20, 30, 40};
      myNum[0] = 50;
      System.out.println(myNum.length);
      
      for (int i = 0; i < cars.length; i++) {
        System.out.println(cars[i]);
      }
      
      for (int i : myNum ){
        System.out.println(i);
      }
      
      //multiArray
      int[][] myNum2 = {{1, 2, 3, 4}, {5, 6, 7}};
      System.out.println(myNum2[0][1]);
      
      int[][] myNum22 = new int[10][5];
      
      myNum22[0][0] = 23;
      myNum22[0][1] = 67;
      myNum22[0][2] = 70;
      myNum22[0][3] = 6;
      
      myNum22[1][0] = 0;
      myNum22[1][1] = 11;
      myNum22[1][2] = 12;
      myNum22[1][3] = 13;
      
      System.out.println(myNum22[0][3]);
      
      //3d array
      int[][][] myNum3 = {{{1, 2, 3}, {4, 5, 6}}, {{7, 8}, {9, 0}}};
      System.out.println(myNum3[0][1][1]);
      reallife();
  }
  
  public static void reallife(){
    int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};
        
    float avg, sum = 0;
        
    int length = ages.length;
        
    for (int age : ages) {
        sum += age;
    }
    avg = sum / length;
        
    System.out.println("The average age is: " + avg);
    int lowestage = ages[0];
        
    for (int age : ages) {
      if (lowestage > age){
        lowestage = age;
      }
    }
        
    System.out.println("The lowest age in the array is: " + lowestage);
    
    sum(new int[]{10, 20, 30, 40, 50});
  }
  
  public static void sum(int[] x){
    int total = 0;
    
    for(int x1 : x) {
      total += x1;
    }
    
    System.out.println("Total sum: " + total);
  }
}