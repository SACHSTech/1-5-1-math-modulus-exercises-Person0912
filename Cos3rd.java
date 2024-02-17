class Cos3rd extends ConsoleProgram {

  /**
  * A program Cos3rd.java that calculates the length of the side of a triangle
  * using cosine law based on user input of two side lengths and the contained angle.
  * @author: Kayla Jin
  */
  
  public void run() {
    
    // declare variables
    double dblSideA;
    double dblSideB;
    double dblSideC;
    double dblAngleC;

    // receive input from the user
    dblSideA = readDouble("Enter the length of side A: ");
    dblSideB = readDouble("Enter the length of side B: ");
    dblAngleC = readDouble("Enter angle C: ");

    // calculate the side length
    dblSideC = Math.sqrt(Math.pow(dblSideA, 2) + Math.pow(dblSideB, 2) - 2 * dblSideA * dblSideB * Math.cos((Math.toRadians(dblAngleC))));

    // output the result to the user
    System.out.println("The third side of the triangle is: " + dblSideC);

  }
}