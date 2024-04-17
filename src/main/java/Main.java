  import java.util.Scanner;

  public class Main {
      public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
  System.out.print("Długość boku ");
  int x = scanner.nextInt();


      for (int i = 0; i < x; i++) {
        for (int j=x; j>i+1; j--){
          if (i == 0 || i == x - 1 || j == 0 || j == x - 1) {
              System.out.print(" #");
          } else {
              System.out.print("  ");
          }
      }
      System.out.println();
  }
  }
  }