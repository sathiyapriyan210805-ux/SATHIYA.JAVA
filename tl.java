import java.util.Scanner;
class tl{
public static void main(String[] args){
Scanner sc = new Scanner (System.in);
String tl = sc.nextLine();
switch(tl)
{
case "r" :
System.out.println("stop");
break;
case "y":
System.out.println("ready");
break;
case "g":
System.out.println("go");
break;
default:
System.out.println("invalid");
}
}
}       