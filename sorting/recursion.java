import java.util.*;

public class recursion{
  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    int num = input.nextInt();
    System.out.println("Factorial of " + num + " is " + factorial(num));
    return;
  }


  public static long factorial(int n){
    if(n == 1 || n == 0) return 1;
    return n * factorial(n - 1);
  }
}
