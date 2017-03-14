package mypack;
import java.lang.*;

@interface Author {
  String author() default "yaweiw";
}

@Author(author = "yawei")
public class Hello {
   public static void main(String[] args) {
      System.out.println("Hello, world!");
   }
}