class AreaSin extends ConsoleProgram {

  /**
  * The program AreaSin.java calculates the area of a triangle given two sides
  * and a contained angle.
  * @author: Kayla Jin 
  */
  
  public void run() {
    
    // declare variables
    double dblSideA;
    double dblSideB;
    double dblAngleC;
    double dblTriangleArea;

    // gather user input
    dblSideA = readDouble("Enter the length of side A: ");
    dblSideB = readDouble("Enter the length of side B: ");
    dblAngleC = readDouble("Enter the degree of angle C: ");

    // calculate the area of the triangle
    dblTriangleArea = dblSideA * dblSideB * Math.sin(Math.toRadians(dblAngleC)) / 2;

    // output the result
    System.out.println("The area of the triangle is: " + dblTriangleArea);
    
  }
}