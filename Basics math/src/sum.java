import java.util.Scanner;
public class sum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int a;
    int b;
    a = sc.nextInt();
    b = sc.nextInt();
    int sum = a + b;
    int difference = a - b;
    int product = a * b;
    /*
    in the above code we are taking two integers as input from the user and then we are calculating the sum, difference and product of those two integers and then we are printing the result on the console. machine priority is by brackets then by multiplication and division and then by addition and subtraction. so in the above code first we are calculating the sum, difference and product of a and b and then we are printing the result on the console.
     */
    
    System.out.println("the sum of " + a + " and " + b + " is " + sum);
    System.out.println("the difference of " + a + " and " + b + " is " + difference);
    System.out.println("the product of " + a + " and " + b + " is " + product);
     sc.close();
  }
 
}
