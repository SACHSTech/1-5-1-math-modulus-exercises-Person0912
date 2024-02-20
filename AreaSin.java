class AreaSin extends ConsoleProgram {

  /**
  * A program AreaSin.java that calculates the area of a triangle given two side lengths
  * and a contained angle.
  * @author: Kayla Jin 
  */
  
  public void run() {
    
    // Declare variables
    double dblSideA;
    double dblSideB;
    double dblAngleC;
    double dblTriangleArea;

    // Gather user input
    dblSideA = readDouble("Enter the length of side A: ");
    dblSideB = readDouble("Enter the length of side B: ");
    dblAngleC = readDouble("Enter the degree of angle C: ");

    // Calculate the area of the triangle
    dblTriangleArea = dblSideA * dblSideB * Math.sin(Math.toRadians(dblAngleC)) / 2;

    // Output the result
    System.out.println("The area of the triangle is: " + dblTriangleArea);
    
  }
}