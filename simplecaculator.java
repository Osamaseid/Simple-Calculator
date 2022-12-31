import java.util.Scanner;

public class simpleCaculator{

public static void main(string[] args){

      additon();
    System.out.println("additn is ended");
      subtraction();
    System.out.printli("subtraction is ended");
      multiplication();
    Systen.out.println("multiplication is ended");
      division();
    System.out.println("division is ended");
      remainder();
    System.out.println("remainder is ended");
                             }
public static void additon(){

    Scnnner input=new Scanner(system.in);
      double a;
      double b;
      double sum;
    System.out.println("please enter the first value");
      a=input.nextdouble();
    System.out.println("please enter the second value");
      b=input.nextdouble();
      sum=a+b;
    System.out.println("the sum is%n"+sum);
}
public static void subtraction(){

    Scnnner input=new Scanner(system.in);
      double a;
      double b;
      double sub;
    System.out.println("please enter the first value");
      a=input.nextdouble();
    System.out.println("please enter the second value");
      b=input.nextdouble();
      sub=a-b;
    System.out.println("the subtraction is%n"+sub);
}
public static void multiplcation() {

    Scnnner input=new Scanner(system.in);
      double a;
      double b;
      double mul;
    System.out.println("please enter the first value");
      a=input.nextdouble();
    System.out.println("please enter the second value");
      b=input.nextdouble();
      mul=a*b;
    System.out.println("the multiplication is%n"+mul);
}

public static void division(){

    Scnnner input=new Scanner(system.in);
      double a;
      double b;
      double div;
    System.out.println("please enter the first value");
      a=input.nextdouble();
    System.out.println("please enter the second value");
      b=input.nextdouble();
      div=a/b;
    System.out.println("the division is%n"+div);
}
public static void remainder(){

    Scnnner input=new Scanner(system.in);
      double a;
      double b;
      double rem;
    System.out.println("please enter the first value");
      a=input.nextdouble();
    System.out.println("please enter the second value");
      b=input.nextdouble();
      rem=a%b;
    System.out.println("the remainder is%n"+rem);
}

} 