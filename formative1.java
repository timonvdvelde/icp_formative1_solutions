import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int choice;
    double celsius, fahrenheit;

    System.out.println("Do you want to convert from Fahrenheit to Celsius, enter 0. If you want to convert Celsius to Fahrenheit, enter 1");
    choice = input.nextInt();
    
    // Fahrenheit to Celsius
    if (choice == 0) {
      System.out.println("Please enter a temperature in Fahrenheit: ");
      fahrenheit = input.nextDouble();
      celsius = (fahrenheit - 32) * 5 / 9;
      System.out.printf("Temperature in Celsius is %f C\n", celsius);
    }
    // Celsius to Fahrenheit
    else if (choice == 1) {
      System.out.println("Please enter a temperature in Celsius: ");
      celsius = input.nextDouble();
      fahrenheit = celsius * 9 / 5 + 32;
      System.out.printf("Temperature in Fahrenheit is %f F\n", fahrenheit);
    }
    // What do we do if we have invalid input?
    else {
      System.out.println("That was never an option.");
      return;
    }

  }
}
