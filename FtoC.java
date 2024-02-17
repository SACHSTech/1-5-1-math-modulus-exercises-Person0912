class FtoC extends ConsoleProgram {

  /**
  * A program FtoC.java that receives a degree in Fahrenheit from the user
  * and prints the result in celsius.
  * @author: Kayla Jin
  */
  
  public void run() {
    
    // declare variables
    double dblFahrenheit;
    double dblCelsius;

    // receive user input
    dblFahrenheit = readDouble("Enter the degrees in fahrenheit: ");

    // calculate the degrees in celsius
    dblCelsius = 5.0 / 9.0 * (dblFahrenheit - 32);
    
    // output the result
    System.out.println("The degrees in celsius is: " + dblCelsius);
    
  }
}