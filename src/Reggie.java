import java.util.Scanner;

public class Reggie {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String ssn = SafeInput.getRegExString(in, "Enter your SSN", "\\d{3}-\\d{2}-\\d{4}");
    String mNumber = SafeInput.getRegExString(in, "Enter your M number", "(M|m)\\d{5}");
    String menuChoice = SafeInput.getRegExString(in, "Enter your menu choice", "[OoSsVvQq]");

    System.out.println("Your SSN is " + ssn + ", your M number is " + mNumber + ", and your menu choice is " + menuChoice);
  }
}

