class FtoC extends ConsoleProgram {

  /**
  * A program FtoC.java that receives a degree in Fahrenheit from the user
  * and prints the result in celsius.
  * @author: Kayla Jin
  */
  
  public void run() {
    
    // Declare variables
    double dblFahrenheit;
    double dblCelsius;

    // Receive user input
    dblFahrenheit = readDouble("Enter the degrees in fahrenheit: ");

    // Calculate the degrees in celsius
    dblCelsius = 5.0 / 9.0 * (dblFahrenheit - 32);
    
    // Output the result
    System.out.println("The degrees in celsius is: " + dblCelsius);
    
  }
}