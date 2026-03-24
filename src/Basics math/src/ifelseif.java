import java.util.Scanner;

;
public class ifelseif {
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   int button;
  //  int b;

   button = sc.nextInt();
  //  b = sc.nextInt();
  //  if(button == 1){
  //   System.out.println(" Namaste Duniya");
  //  }
  //  else if(button == 2){
  //   System.out.println("Hello World");
  //  }
  //  else if(button == 3){
  //   System.out.println("Hola Mundo");
  //  }
  //  else{
  //   System.out.println("Invalid button");
  //  }


  switch(button){
    case 1:
      System.out.println("Namaste Duniya");
      break;
    case 2:
      System.out.println("Hello World");
      break;
    case 3:
      System.out.println("Hola Mundo");
      break;
    default:
      System.out.println("Invalid button");
  }
  sc.close();

  }
  
}
