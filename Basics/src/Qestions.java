import java.util.Scanner;
public class Qestions {

  //Enter 3 numbers from the user & make a function to print their average.
  // public static void main(String[] args) {
  //   Scanner sc = new Scanner(System.in);
  //   System.out.println("Enter three numbers:");
  //   int a = sc.nextInt();
  //   int b = sc.nextInt();
  //   int c = sc.nextInt();
  //   int average = average(a, b, c);
  //   System.out.println("The average is: " + average);
  // }

  // public static int average(int a, int b, int c) {
  //   return (a + b + c) / 3;
  // }

    //Write a function to print the sum of all odd numbers from 1 to n.
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number:");
      int n = sc.nextInt();
      int sum = sumOfOddNumbers(n);
      System.out.println("The sum of odd numbers from 1 to " + n + " is: " + sum);
    }

  
  
  public static int sumOfOddNumbers(int n) {
    int sum = 0;
    for (int i = 1; i <= n; i++) {
      if (i % 2 != 0) {
        sum += i;
      }
    }
    return sum;
  }
}