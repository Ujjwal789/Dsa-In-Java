import java.util.Scanner;

public class sum_of_n {
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the value of n:");
    int n = sc.nextInt();
    
    int sum = 0;
    for(int i=1; i<=n; i++){
      sum = sum +i;
    }
    System.out.println(sum);

    System.out.println("number of table you want to print :");
    int i = sc.nextInt();
    for(int j=1; j<=10; j++){
      System.out.println(i*j);
    }
    sc.close();
  }
  
}
