package me.darkdarcool.nodenet;
import java.util.Arrays;
import me.darkdarcool.nodenet.utils.types.*;
public class Main {
  // public Arg arg = new Arg("hello");
  private static String arg1 = "";
  public static void main(String[] args) {
    try {
      arg1 = args[0];
    } catch (Exception e) {
      // No args found 
      // TODO: Make it print a help page 
      System.exit(0);
    }
    Arg arg = new Arg(arg1);
    System.out.println(arg.toString());
  }
}