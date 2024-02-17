class Power extends ConsoleProgram {

  /**
  * A program Power.java that lets you enter a base and an exponent
  * and outputs the result.
  * @author: Kayla Jin
  */
  
  public void run() {
    
    // define variables
    double dblBase;
    double dblExponent;
    double dblResult;

    // receive user input
    dblBase = readDouble("What is the base? ");
    dblExponent = readDouble("What is the exponent? ");

    // perform calculations
    dblResult = Math.pow(dblBase, dblExponent);

    // output the result
    System.out.println("The result is: " + dblResult);
    
  }
}