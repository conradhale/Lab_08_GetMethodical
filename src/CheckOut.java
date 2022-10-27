import java.util.Scanner;

public class CheckOut {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    double itemCost;
    double totalCost = 0;
    boolean cont;

    do {
      itemCost = SafeInput.getRangedDouble(in, "Enter the price of your item", .50, 9.99);
      cont = SafeInput.getYNConfirm(in, "Do you have more items?");
      totalCost += itemCost;
    } while (cont);

    System.out.printf("The total cost of your items is $%5.2f%n", totalCost);
  }
}