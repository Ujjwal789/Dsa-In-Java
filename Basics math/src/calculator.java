import java.util.Scanner;

public class calculator {
  public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    int a, b;
    System.out.println("Enter first numbers:");
    a = sc.nextInt();
    System.out.println("Enter second numbers:");
    b = sc.nextInt();

    System.out.println("Enter the operation you want to perform:");
    System.out.println("1 - Addition");
    System.out.println("2 - Subtraction");
    System.out.println("3 - Multiplication");
    System.out.println("4 - Division");

    int choice = sc.nextInt(); // Read the user's choice for the operation nextint means we are reading an integer  keyboard input and storing it in the variable choice


    switch (choice) {
      case 1:
        System.out.println(a + b);
        break;
      case 2:
        System.out.println(a - b);
        break;
      case 3:
        System.out.println(a * b);
        break;
      case 4:
        System.out.println(a / b);
        break;
      default:
        break;
    }
    sc.close();
  
  }
  
}
