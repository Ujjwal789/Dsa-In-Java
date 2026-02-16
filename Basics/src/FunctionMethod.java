import java.util.Scanner;

public class FunctionMethod {

  // public static int multiply(int a, int b){
  //   int multiply = a * b;
   
  //   return multiply;
  // }
  // public static void main(String[] args){
  //   Scanner sc = new Scanner(System.in);
  //   System.out.println("Enter the value of a and b:");

  //   int a = sc.nextInt();
  //   int b = sc.nextInt();

    
  //   int sum = sum(a, b);

  //   System.out.println(sum + " is the sum of a and b");

  //   sc.close();
  // }

  // public static void main(String[] args) {
  //   Scanner sc = new Scanner(System.in);
  //   System.out.println("Enter the value of a and b:");

  //   int a = sc.nextInt();
  //   int b = sc.nextInt();

    
  //   int multiply = multiply(a, b);

  //   System.out.println(multiply + " is the multiplication of a and b");

  //   sc.close();
  // }

  public static void factorial(int n){
    
    int factorial = 1;
    for(int i=n; i>=1; i--){
      factorial = factorial * i;
    }
    System.out.println(factorial);
    return;
  }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of n:");
    int n = sc.nextInt();
    factorial(n);
    sc.close();
  }
}
