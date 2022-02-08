/*
 * Test System.out.println() (print-line) and System.out.print().
 */
public class PrintSquarePattern {   // Save as "PrintSquarePattern.java"
   public static void main(String[] args) {
      System.out.println("* * * * *");       // Advance the cursor to the beginning of next line after printing
      System.out.println("*       *"); // Advance the cursor to the beginning of next line after printing
      System.out.println("*       *");                     // Print an empty line
      System.out.println("*       *");         // Cursor stayed after the printed string
      System.out.println("* * * * *");   // Cursor stayed after the printed string
   }
}