class Cos3rd extends ConsoleProgram {

  /**
  * A program Cos3rd.java that calculates the length of the side of a triangle
  * using cosine law based on user input of two side lengths and a contained angle.
  * @author: Kayla Jin
  */
  
  public void run() {
    
    // Declare variables
    double dblSideA;
    double dblSideB;
    double dblSideC;
    double dblAngleC;

    // Receive input from the user
    dblSideA = readDouble("Enter the length of side A on a triangle: ");
    dblSideB = readDouble("Enter the length of side B on a triangle: ");
    dblAngleC = readDouble("Enter the angle of C: ");

    // Calculate the side length
    dblSideC = Math.sqrt(Math.pow(dblSideA, 2) + Math.pow(dblSideB, 2) - 2 * dblSideA * dblSideB * Math.cos((Math.toRadians(dblAngleC))));

    // Output the result to the user
    System.out.println("The third side of the triangle is: " + dblSideC);

  }
}