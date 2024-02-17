class Rads extends ConsoleProgram {

  /**
  * A program Rads.java that converts degree measures to radian measures
  * @author: Kayla Jin
  */
  
  public void run() {
    
    // define variables
    double dblDegrees;
    double dblRadians;

    // receive input
    dblDegrees = readDouble("Enter a number in degrees: ");

    // calculations
    dblRadians = Math.toRadians(dblDegrees);

    // output
    System.out.println("The number " + dblDegrees + " in radians is: " + dblRadians);
    
  }
}