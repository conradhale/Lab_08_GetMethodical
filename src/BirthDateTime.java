import java.util.Scanner;

public class BirthDateTime {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int days = 31;
    int birthYear = SafeInput.getRangedInt(in, "Enter your birth year", 1950, 2010);
    int birthMonth = SafeInput.getRangedInt(in, "Enter your birth month", 1, 12);
    switch (birthMonth) {
      case 4, 6, 9, 11 -> days = 30;
      case 2 -> days = 29;
    }
    int birthDay = SafeInput.getRangedInt(in, "Enter your birth day", 1, days);
    int birthHour = SafeInput.getRangedInt(in, "Enter your birth hour", 1, 24);
    int birthMin = SafeInput.getRangedInt(in, "Enter your birth minute", 1, 59);

    System.out.println("\nYou were born at " + birthHour + ":" + birthMin + " on " + birthMonth + "/" + birthDay + "/" + birthYear);
  }
}