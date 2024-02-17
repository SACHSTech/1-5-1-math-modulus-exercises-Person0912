class Minutes extends ConsoleProgram {

  /**
  * A program Minutes.java that allows the user to input a number of minutes
  * and outputs its conversion to days, hours, and minutes.
  * @author: Kayla Jin
  */
  
  public void run() {
    
    // Define variables
    int intInputedMinutes;
    int intDays;
    int intHours;
    int intRemainingMinutes;
    int intMinutes;

    // Receive user input
    intInputedMinutes = readInt("Enter a number in minutes as an integer: ");

    // Perform calculations 
    intDays = intInputedMinutes / 1440;
    intRemainingMinutes = intInputedMinutes % 1440;
    intHours = intRemainingMinutes / 60;
    intMinutes = intInputedMinutes % 60;

    // Output the result
    System.out.println(intInputedMinutes + " minutes is equivalent to " + intDays + " days, " + intHours + " hours, and " + intMinutes + " minutes.");
    
  }
}