class Hours extends ConsoleProgram {

  /**
  * A program Hours.java that receives user input in hours and outputs
  * its conversion in days and hours.
  * @author: Kayla Jin
  */
  
  public void run() {
    
    // Define variables
    double dblHours;
    double dblDays;
    double dblDaysHours;

    // Receive user input
    dblHours = readDouble("Enter a number in hours: ");

    // Perform calculations 
    dblDaysHours = dblHours % 24;
    dblDays = (dblHours-dblDaysHours) / 24;

    // Output the result
    System.out.println(dblHours + " hours is equivalent to " + dblDays + " days and " + dblDaysHours + " hours.");
    
  }
}