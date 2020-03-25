package finalProject;
import java.util.Scanner;

/**
 * Program to compute gas mileage and inform user of
 * what work needs to be done on their car.
 * 
 * @author Nicholas Farish
 *03/25/20
 */
public class carCare {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int user = 0;
    while (user != 1 && user != 2 && user != 3) {
      System.out.println("What would you like to do?");
      System.out.println("\t1. Check gas mileage.");
      System.out.println("\t2. Check when you need your next service.");
      System.out.println("\t3. Exit.");
      System.out.print("Please enter a menu selection: ");
      user = input.nextInt();
    } 
    
    if (user == 1) {
      fillUp();
    } 
    else if (user == 2){
      checkUp();
    } 
    else {
    }
    
  }
  
  /**
   * Takes gas mileage and gas gallons input and
   * outputs gas mileage and information on if user
   * needs an oil change.
   */
  public static void fillUp() {
    Scanner input = new Scanner(System.in);
    int mileage = 0;
    int oldMileage = 0;
    double gallons = 0.0D;
    System.out.print("Enter your mileage from last fill up: ");
    oldMileage = input.nextInt();
    System.out.print("Enter your current mileage: ");
    mileage = input.nextInt();
    System.out.print("Enter the number of gallons for the current fill up: ");
    gallons = input.nextDouble();
    System.out.printf("Your MPG for the last fill up was: %3.2f\n", new Object[] { Double.valueOf(mpg(mileage, oldMileage, gallons)) });
    newOil(mileage);
  }
  
  /**
   * Takes gas mileage and output when the next 
   * maintenance is needed for the car.
   */
  public static void checkUp() {
    Scanner input = new Scanner(System.in);
    int mileage = 0;
    System.out.print("Enter your current mileage: ");
    mileage = input.nextInt();
    int i;
    for (i = 0; i < 50; i++) {
      if (mileage < (i + 1) * 6000 && mileage >= i * 6000)
        System.out.println("Your tires need to be balanced and rotated at: " + ((
            i + 1) * 6000)); 
    } 
    for (i = 0; i < 12; i++) {
      if (mileage < (i + 1) * 25000 && mileage >= i * 25000)
        System.out.println("Your car needs a tune up at: " + ((
            i + 1) * 25000)); 
    } 
    for (i = 0; i < 10; i++) {
      if (mileage < (i + 1) * 30000 && mileage > i * 30000) {
        System.out.println("Your car needs a new air filter at: " + ((
            i + 1) * 30000));
        System.out.println("Your car needs the transmission fluid change: " + ((
            i + 1) * 30000));
      } 
    } 
    for (i = 0; i < 6; i++) {
      if (mileage < (i + 1) * 50000 && mileage > i * 50000)
        System.out.println("Your car needs new brake pads at: " + ((
            i + 1) * 50000)); 
    } 
    for (i = 0; i < 5; i++) {
      if (mileage < (i + 1) * 60000 && mileage > i * 60000)
        System.out.println("Your car needs a new drive or serpentine belt at: " + ((
            i + 1) * 60000)); 
    } 
  }
  
  /**
   * Takes the user inputs of mileages and gallons
   * at fillup and returns mpg.
   * 
   * @param a int of the current mileage of the car.
   * @param b int of the previous mileage of the car.
   * @param c double of the number of gallons put into
   * the care at fillup.
   * 
   * @return double representing the mpg of the 
   * previous tank of gas.
   */
  public static double mpg(int a, int b, double c) {
    int miles = a - b;
    double mpg = miles / c;
    return mpg;
  }
  
  /**
   * Method to check whether or not the car needs an
   * oil change and outputs the needed information.
   * 
   * @param a int for the current mileage of the car.
   */
  public static void newOil(int a) {
    int[] oilChange = new int[60];
    int i;
    for (i = 0; i < 60; i++)
      oilChange[i] = (i + 1) * 5000; 
    for (i = 0; i < oilChange.length; i++) {
      if (a <= oilChange[i] + 200 && a >= oilChange[i]) {
        System.out.println("You need an oil change!");
      } else if (a >= oilChange[i] - 500 && a < oilChange[i]) {
        System.out.println("You will need an oil change at " + oilChange[i]);
      } 
    } 
  }
}