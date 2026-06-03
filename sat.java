import java.util.Scanner;
public class logic{
public static void main(String[] args){
Scanner sc = new Scanner (System.in);
       System.out.println("enter the first number:");
       int age = sc.nextInt();
       System.out.println("enter the second number:");
       int mark = sc.nextInt();
       System.out.println((age>=18) && (mark>=50));
      }
}       