class Circumference extends ConsoleProgram {

  /**
  * A program Circumference.java that finds the circumference of a 
  * circle from a radius inputed by the user.
  * @author: Kayla Jin
  */
  
  public void run() {
    
    // Declare variables
    double dblRadius;
    double dblCircumference;

    // Receive radius
    dblRadius = readDouble("Enter the radius of a circle: ");

    // Calculate the circumference
    dblCircumference = 2 * Math.PI * dblRadius;

    // Output the results
    System.out.println("The circumference of a circle with radius " + dblRadius + " is " + dblCircumference);
    
  }
}