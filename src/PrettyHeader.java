import java.util.Scanner;

public class PrettyHeader {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    SafeInput.prettyHeader(in, "Enter your message (Max 54 characters)");
  }
}

