class Km_to_Miles extends ConsoleProgram {

  /**
  * A program Km_to_Miles.java that takes in user input in kilometres
  * and outputs its conversion in miles.
  * @author: Kayla Jin
  */
  
  public void run() {
    
    // Declare variables
    double dblKilometres;
    double dblMiles;

    // Receive user input
    dblKilometres = readDouble("Enter a distance in kilometres: ");

    // Perform calculations
    dblMiles = dblKilometres * 0.621371;

    // Output the result
    System.out.println(dblKilometres + " kilometres is equivalent to " + dblMiles + " miles.");
    
  }
}
