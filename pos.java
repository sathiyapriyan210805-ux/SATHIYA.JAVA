import java.util.Scanner;
public class pos{
public static void main(String[] args){
Scanner sc = new Scanner (System.in);
String tl = sc.nextInt();
switch(tl);
{
case "r" :
System.out.println("stop");
break;
case "y":
System.out.println("ready");
break;
case "g":
System.out.println("green");
break;
default:
System.out.println("invalid");
}
}
}       