import java.util.Scanner;

public class CheckPassFail {  // Save as "CheckPassFail.java"

public static void password() { 
	 int mark = 45;   // Set the value of "mark" here!
      System.out.println("The mark is " + mark);
 
      // if-else statement
      if ( mark >= 50){
         System.out.println( "Pass");
	  }else {
         System.out.println( "Fail" );
	   }
      System.out.println( "Done" );
	  
	  }
	  
public static void oddeven() {  // Program entry point
      int number = 70;       // Set the value of "number" here!
      System.out.println("The number is " + number);
      if ( number %2 == 0 ) {
         System.out.println( " It's even number" );   // even number
      } else {
         System.out.println( "It's odd number" );   // odd number
      }
      System.out.println( "bye!" );
   }

public static void printnumber() {
      int number = 10;  // Set the value of "number" here!
 
      // Using nested-if
      if (number == 1) {   // Use == for comparison
         System.out.println( "ONE" );
      } else if ( number == 2 ) {
         System.out.println( "TWO" );
      } else if ( number == 3 ) {
         System.out.println( "THREE" );
	  }
        else if ( number == 4 ) {
         System.out.println( "FOUR" );
	  }
         else if ( number == 5 ) {
         System.out.println( "FIVE" );
	  }
	     else if ( number == 6 ) {
         System.out.println( "SIX" );
      }
	     else if ( number == 7 ) {
         System.out.println( "SEVEN" );
	  }
	     else if ( number == 8 ) {
         System.out.println( "EIGHT" );
	  }
	     else if ( number == 9 ) {
         System.out.println( "NINE" );
	  }
	  else {
         System.out.println( "OTHER" );
      }
 
      // Using switch-case-default
      switch(number) {
         case 1: 
            System.out.println( "ONE" ); break;  // Don't forget the "break" after each case!
         case 2: 
            System.out.println( "TWO" ); break;
         case 3: 
            System.out.println( "TRHEE" ); break;
         case 4: 
            System.out.println( "FOUR" ); break;
		 case 5: 
            System.out.println( "FIVE" ); break;
		 case 6: 
            System.out.println( "SIX" ); break;
		 case 7: 
            System.out.println( "SEVEN" ); break;
		 case 8: 
            System.out.println( "EIGHT" ); break;
		 case 9: 
            System.out.println( "NINE" ); break;
			
         default: System.out.println( "OTHER" ); 
      }
   }
   
public static void sumaverage () {
      // Define variables
      int sum = 0;          // The accumulated sum, init to 0
      double average;       // average in double
      final int LOWERBOUND = 1;
      final int UPPERBOUND = 100;
	  int number = LOWERBOUND;
      // Use a for-loop to sum from lowerbound to upperbound
      while (number <= UPPERBOUND) {
            // The loop index variable number = 1, 2, 3, ..., 99, 100
         sum += number;     // same as "sum = sum + number"
		 ++number;
      }
      // Compute average in double. Beware that int / int produces int!
      average = (double) sum/ (double) (UPPERBOUND - LOWERBOUND - UPPERBOUND + number);
      // Print sum and average
      System.out.println("the sum is "+ sum);
	  System.out.println(" ");
	  System.out.println("the average is " + average);
   }

public static void add2integers () {
      // Declare variables
      int number1, number2, sum;

      // Put up prompting messages and read inputs as "int"
      Scanner in = new Scanner(System.in);  // Scan the keyboard for input
      System.out.print("Enter first integer: ");  // No newline for prompting message
      number1 = in.nextInt();                     // Read next input as "int"
      System.out.print ("Enter second integer:");
	  number2 = in.nextInt();
      in.close();  // Close Scanner

      // Compute sum
      sum = number1 + number2;

      // Display result
      System.out.println("The sum is: " + sum);   // Print with newline
   }

public static void sumproduct () {
	 // Declare variables
      int number1, number2, number3;  // The 3 input integers
      int sum, product, min, max;     // To compute these
	  
      // Prompt and read inputs as "int"
      Scanner in = new Scanner(System.in);  // Scan the keyboard
      System.out.print("Enter 1st integer: ");
	  number1 = in.nextInt();
      System.out.print("Enter 2nd integer: ");
	  number2 = in.nextInt();
	  System.out.print("Enter 3rd integer: ");
	  number3 = in.nextInt();
      in.close();
	  
      // Compute sum and product
      sum = number1 + number2 + number3;
      product = number1 * number2 * number3;

      // Compute min
      // The "coding pattern" for computing min is:
      // 1. Set min to the first item
      // 2. Compare current min with the second item and update min if second item is smaller
      // 3. Repeat for the next item
      min = number1;        // Assume min is the 1st item
      if (number2 < min) {  // Check if the 2nd item is smaller than current min
         min = number2;     // Update min if so
      }
      if (number3 < min) {  // Continue for the next item
         min = number3;
      }
      
      // Compute max - similar to min
      max = number1;        // Assume min is the 1st item
      if (number2 > max) {  // Check if the 2nd item is smaller than current min
         max = number2;     // Update min if so
      }
      if (number3 > max) {  // Continue for the next item
         max = number3;
      }
	  
      // Print results
      System.out.println(" The sum is: " + sum);
	  System.out.println("The product is: " + product);
	  System.out.println("The min is: " + min);
	  System.out.println("The max is: " + max);
}
   public static void main(String[] args) {  // Program entry point
   System.out.println ("exo 1.2 ");
   password ();
   System.out.println (" ");
   System.out.println ("exo 1.3 ");
   oddeven ();
   System.out.println (" ");
   System.out.println ("exo 1.4");
   printnumber ();
   System.out.println (" ");
   System.out.println ("exo 4.1 ");
   sumaverage ();
   System.out.println(" ");
   System.out.println ("exo 5.1");
   //add2integers ();
   System.out.println (" ");
   System.out.println ("exo 5.2");
   sumproduct();
   System.out.println(" ");
   
   }
}