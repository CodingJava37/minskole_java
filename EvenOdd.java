import java.util.Scanner;

//public class name
 public class EvenOdd {

  //start
 //abc.java  - javac - abc.class - jvm - result
  public static void main(String[] args) { //psvm - jvm - start
   //start
   Scanner sc = new Scanner(System.in); //num input
   int x = sc.nextInt();//input read
   //check if x is even or odd
   if(x%2 == 0){
    System.out.println("num is even");
   }
   else {
    System.out.println("num is odd");
   }
  }
}
