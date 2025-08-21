import java.util.*;

public class Main {
    public static void main(String[] args) {
        int num = 90;

        // Conditional check
        if (num < 10) {
            System.out.println("Small number");
        } else if (num < 50) {
            System.out.println("User status: false");
        } else {
            System.out.println("Big number");
        }

        // Ternary operator
        int num1 = 30;
        String result = (num1 == 30) ? "Equal number" : "Not equal";
        System.out.println(result);

        // Call switch-case method
        switchLoop();
    }

    public static void switchLoop() {
      //   Scanner input = new Scanner(System.in);
    	 // System.out.println("Enter your name: ");
    	 // int day = input.nextInt();
      //   //int day = scanner.nextInt();

        // Switch-case for day mapping
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thu");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
            default:
                System.out.println("Out of range");
        }

        //scanner.close();
        
        whileloop();
    }
    
    public static void whileloop() {
      int num = 10;
      while (num < 15) {
        System.out.println(num);
        num++;
      }
      do {
        System.out.println("test " + num);
        num++;
      } while (num == 11);
      
      forloop();
      javaArray.three3darray();
    }
    
    public static void forloop(){
      for (int i = 1; i <= 3; i++) {
        for (int j = 1; j <= 3; j++) {
          System.out.print(i * j + " ");
        }
        System.out.println();
      }
      
      String[] cars = {"Vovle", "BMW", "Ford", "Mazda"};
      for (String i : cars){
        System.out.println(i);
      }
    }
}

class javaArray{
  public static void three3darray() {
    int[][][] mynum = {{{1, 3, 5}, {5, 6, 7}}};
    System.out.println(mynum[0][0][1]);
  }
}