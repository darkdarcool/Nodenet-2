package me.darkdarcool.nodenet;
import me.darkdarcool.nodenet.commands.Test;
public class Main {
  private static String arg1;
  public static void main(String[] args) {
    try {
      arg1 = args[0];
    } catch (Exception e) {
      // No args found
      // TODO: Make it print a help page!
      System.exit(0);
    }
    if (arg1.equals("test")) Test.TestCommand(args);
  }
}