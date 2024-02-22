class Rads extends ConsoleProgram {

  /**
  * A program Rads.java that converts degree measures to radian measures.
  * @author: Kayla Jin
  */
  
  public void run() {
    
    // Define variables
    double dblDegrees;
    double dblRadians;

    // Receive input
    dblDegrees = readDouble("Enter a number in degrees: ");

    // Calculations
    dblRadians = Math.toRadians(dblDegrees);

    // Output
    System.out.println("The number " + dblDegrees + " in radians is: " + dblRadians);
    
  }
}