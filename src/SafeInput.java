import java.util.Scanner;

public class SafeInput {
  /**
   *
   * @param pipe Scanner
   * @param prompt Message
   * @return String
   */
  public static String getNonZeroLenString(Scanner pipe, String prompt) {
    String retString;  // Set this to zero length. Loop runs until it isn’t
    do {
      System.out.print(prompt + ": "); // show prompt add space
      retString = pipe.nextLine();
    } while (retString.length() == 0);

    return retString;
  }

  /**
   *
   * @param pipe Scanner
   * @param prompt String
   * @return int
   */
  public static int getInt(Scanner pipe, String prompt) {
    int retInt = -1;
    String trash;
    boolean done = false;

    do {
      System.out.print(prompt + ": ");

      if (pipe.hasNextInt()) {
        retInt = pipe.nextInt();
        pipe.nextLine();
        done = true;
      } else {
        trash = pipe.nextLine();
        System.out.println("You entered " + trash + ", which is invalid.");
      }
    } while (!done);

    return retInt;
  }

  /**
   *
   * @param pipe Scanner
   * @param prompt String
   * @return double
   */
  public static double getDouble(Scanner pipe, String prompt) {
    double retDouble = -1;
    String trash;
    boolean done = false;

    do {
      System.out.print(prompt + ": ");

      if (pipe.hasNextDouble()) {
        retDouble = pipe.nextDouble();
        pipe.nextLine();
        done = true;
      } else {
        trash = pipe.nextLine();
        System.out.println("You entered: " + trash + ", which is invalid.");
      }
    } while (!done);

    return retDouble;
  }

  /**
   *
   * @param pipe Scanner
   * @param prompt String
   * @param low int
   * @param high int
   * @return int
   */
  public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
    int retInt = -1;
    String trash;
    boolean done = false;

    do {
      System.out.print(prompt + " [" + low + " - " + high + "]: ");
      if (pipe.hasNextInt()) {
        retInt = pipe.nextInt();
        pipe.nextLine();
        if (retInt <= low) {
          System.out.println("You entered " + retInt + ", which is lower than " + low + ".");
        } else if (retInt >= high) {
          System.out.println("You entered " + retInt + ", which is higher than " + high + ".");
        } else {
          done = true;
        }
      } else {
        trash = pipe.nextLine();
        System.out.println("You entered " + trash + ", which is invalid.");
      }
    } while (!done);

    return retInt;
  }

  /**
   *
   * @param pipe Scanner
   * @param prompt String
   * @param low double
   * @param high double
   * @return double
   */
  public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
    double retDouble = -1;
    String trash;
    boolean done = false;

    do {
      System.out.printf("%s [%4.2f - %4.2f]: ", prompt, low, high);
      if (pipe.hasNextDouble()) {
        retDouble = pipe.nextDouble();
        pipe.nextLine();
        if (retDouble <= low) {
          System.out.printf("You entered %4.2f, which is lower than %4.2f.%n", retDouble, low);
        } else if (retDouble >= high) {
          System.out.printf("You entered %4.2f, which is higher than %4.2f.%n", retDouble, high);
        } else {
          done = true;
        }
      } else {
        trash = pipe.nextLine();
        System.out.println("You entered " + trash + ", which is invalid.");
      }
    } while (!done);

    return retDouble;
  }

  /**
   *
   * @param pipe Scanner
   * @param prompt String
   * @return boolean
   */
  public static boolean getYNConfirm(Scanner pipe, String prompt) {
    boolean retBool = false;
    String input;
    boolean done = false;

    do {
      System.out.print(prompt + " [y/n]: ");
      input = pipe.nextLine();
      if (input.equalsIgnoreCase("y")) {
        retBool = true;
        done = true;
      } else if (input.equalsIgnoreCase("n")) {
        done = true;
      } else {
        System.out.println("You entered " + input + ", which is invalid.");
      }
    } while (!done);

    return retBool;
  }

  /**
   *
   * @param pipe Scanner
   * @param prompt String
   * @param regEx pattern
   * @return String
   */
  public static String getRegExString(Scanner pipe, String prompt, String regEx) {
    String retString;
    boolean done = false;

    do {
      System.out.print(prompt + ": ");

      retString = pipe.nextLine();

      if (retString.matches(regEx)) {
        done = true;
      } else {
        System.out.println("You entered: " + retString + ", which is invalid.");
      }
    } while (!done);

    return retString;
  }

  public static void prettyHeader(Scanner pipe, String prompt) {
    String message;
    do {
      System.out.print(prompt + ": ");
      message = pipe.nextLine();
    } while (message.length() == 0 || message.length() >= 54);

    int space = ( ( 54 - message.length() ) / 2 );

    System.out.println("*".repeat(60));
    System.out.println("*".repeat(3) + " ".repeat(space) + message + " ".repeat(space) + "*".repeat(3));
    System.out.println("*".repeat(60));
  }
}