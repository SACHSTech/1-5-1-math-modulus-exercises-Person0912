class Circumference extends ConsoleProgram {

  /**
  * A program that finds the circumference of a circle from a radius inputed by the user
  * @author: Kayla Jin
  */
  
  public void run() {
    
    // declare variables
    double dblRadius;
    double dblCircumference;

    // receive radius
    dblRadius = readDouble("Enter the radius: ");

    // calculate the circumference
    dblCircumference = 2 * Math.PI * dblRadius;

    // output the results
    System.out.println("The circumference is of a circle with radius " + dblRadius + " is " + dblCircumference);
    
  }
}