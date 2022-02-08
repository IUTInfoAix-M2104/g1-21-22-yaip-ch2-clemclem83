/*
 * First Java program, which says hello.
 */
public class Hello {   // Save as "Hello.java"

   public static void checker() {
      System.out.println("* * * * *");       // Advance the cursor to the beginning of next line after printing
      System.out.println(" * * * * *"); // Advance the cursor to the beginning of next line after printing
      System.out.println("* * * * *");                     // Print an empty line
      System.out.println(" * * * * *");         // Cursor stayed after the printed string
      System.out.println("* * * * *");   // Cursor stayed after the printed string
   }
   
		public static void carre() {
      System.out.println("* * * * *");       // Advance the cursor to the beginning of next line after printing
      System.out.println("*       *"); // Advance the cursor to the beginning of next line after printing
      System.out.println("*       *");                     // Print an empty line
      System.out.println("*       *");         // Cursor stayed after the printed string
      System.out.println("* * * * *");   // Cursor stayed after the printed string
   }
   
		public static void triangular() {
      System.out.println("* * * * *");       // Advance the cursor to the beginning of next line after printing
      System.out.println(" *     *"); // Advance the cursor to the beginning of next line after printing
      System.out.println("  *   *");                     // Print an empty line
      System.out.println("   * *");         // Cursor stayed after the printed string
      System.out.println("    * ");   // Cursor stayed after the printed string
   }
   
		public static void etoile() {
      System.out.println("    * ");       // Advance the cursor to the beginning of next line after printing
      System.out.println("* *   * *"); // Advance the cursor to the beginning of next line after printing
      System.out.println("   * *");                     // Print an empty line
      System.out.println("  *   * ");         // Cursor stayed after the printed string
      System.out.println(" *     *");   // Cursor stayed after the printed string
   }
   
		public static void mouton() {
      System.out.println("          '__'");       // Advance the cursor to the beginning of next line after printing
      System.out.println("          (oo)"); // Advance the cursor to the beginning of next line after printing
      System.out.println("  /========//");                     // Print an empty line
      System.out.println(" / || @@ ||");         // Cursor stayed after the printed string
      System.out.println("*  ||----||");   // Cursor stayed after the printed string
	  System.out.println("   VV    VV");   // Cursor stayed after the printed string
	  System.out.println("   ''    ''");   // Cursor stayed after the printed string
   }
   
		public static void sum() {
      int number1 = 11;  // Declare 5 integer variables and assign a value
      int number2 = 22;
      int number3 = 33;
      int number4 = 44;
      int number5 = 55;
      int sum;  // Declare an integer variable called sum to hold the sum
      sum = number1 + number2 + number3 + number4 + number5;  // Compute sum
      System.out.print("The sum is ");  // Print a descriptive string
                                        // Cursor stays after the printed string
      System.out.println(sum);  // Print the value stored in variable sum
                                // Cursor advances to the beginning of next line
   }
   
		public static void rectangle() {
      // Declare 3 double variables to hold radius, area and circumference.
      // A "double" holds floating-point number with an optional fractional part.
      double length, width, area, perimeter;
      // Declare a double to hold PI.
      // Declare as "final" to specify that its value cannot be changed (i.e. constant).
      final double PI = 3.14159265;
      
      // Assign a value to length and width. (We shall read in the value from the keyboard later.)
      length = 4.0;
	  width = 2.0;
      // Compute area and perimeter
      area = length * width;
      perimeter = length * length + width * width ;
      
      // Print results
      System.out.print("The lenght is ");  // Print description
      System.out.println(length);          // Print the value stored in the variable
	  System.out.print("The width is ");  // Print description
	  System.out.println(width);          // Print the value stored in the variable
      System.out.print("The area is ");
      System.out.println(area);
      System.out.print("The perimeter is ");
      System.out.println(perimeter);
   }
   
		public static void cylindre() {
      // Declare 3 double variables to hold radius, area and circumference.
      // A "double" holds floating-point number with an optional fractional part.
      double radius, height, area, volume;
      // Declare a double to hold PI.
      // Declare as "final" to specify that its value cannot be changed (i.e. constant).
      final double PI = 3.14159265;
      
      // Assign a value to length and width. (We shall read in the value from the keyboard later.)
      radius = 2.0;
	  height = 6.0;
      // Compute area and perimeter
      area = PI * radius*radius;
      volume = area * height;
      
      // Print results
      System.out.print("The radius is ");  // Print description
      System.out.println(radius);          // Print the value stored in the variable
	  System.out.print("The height is ");  // Print description
	  System.out.println(height);          // Print the value stored in the variable
      System.out.print("The area is ");
      System.out.println(area);
      System.out.print("The volume is ");
      System.out.println(volume);
	 
   }
   
		public static void arithmetic() {
      int number1 = 98; // Declare an int variable number1 and initialize it to 98
      int number2 = 5;  // Declare an int variable number2 and initialize it to 5
	  int number3 = 77; //Declare an int variable number3 and initialize it to 77
      int sum, difference, product, quotient, remainder;  // Declare 5 int variables to hold results
   
      // Perform arithmetic Operations
      sum = number1 + number2 + number3;
      difference = number1 - number2;
      product = number1 * number2 * number3;
      quotient = number1 / number2;
      remainder = number1 % number2;
  
      // Print results
      System.out.print("The sum, difference, product, quotient and remainder of " + remainder);  // Print description
      System.out.print(number1);      // Print the value of the variable
	  System.out.print(number2);
      System.out.print(" and ");
      System.out.print(number3);
      System.out.print(" are ");
      System.out.print(sum);
      System.out.print(", ");
      System.out.print(difference);
      System.out.print(", ");
      System.out.print(product);
      System.out.print(", ");
      System.out.print(quotient);
      System.out.print(", and ");
	  System.out.println(" ");
   
      ++number1;  // Increment the value stored in the variable "number1" by 1
                  // Same as "number1 = number1 + 1"
      --number2;  // Decrement the value stored in the variable "number2" by 1
                  // Same as "number2 = number2 - 1"
      System.out.println("number1 after increment is " + number1*31);  // Print description and variable
      System.out.println("number2 after decrement is " + number2*17);
      quotient = number1 / number2; 
      System.out.println("The new quotient of " + number1 + " and " + number2 
            + " is " + quotient);
   }
   
		public static void finale () {
      final int LOWERBOUND = 1;      // Store the lowerbound
      final int UPPERBOUND = 10;   // Store the upperbound
      int sum = 1;   // Declare an int variable "sum" to accumulate the numbers
                     // Set the initial sum to 0
      // Use a while-loop to repeatedly sum from the lowerbound to the upperbound
      int number = LOWERBOUND;
      while (number <= UPPERBOUND) {
            // number = LOWERBOUND, LOWERBOUND+1, LOWERBOUND+2, ..., UPPERBOUND for each iteration
         sum = sum * number;  // Accumulate number into sum
         number +=1;            // increment number
      }
      // Print the result
      System.out.println("The sum from " + LOWERBOUND + " to " + UPPERBOUND + " is " + sum);
   }
   
		public static void even() {
      final int LOWERBOUND = 1;
      final int UPPERBOUND = 1000;
      int sumOdd  = 0;    // For accumulating odd numbers, init to 0
      int sumEven = 0;    // For accumulating even numbers, init to 0
      int number = LOWERBOUND;
      while (number <= UPPERBOUND) {
            // number = LOWERBOUND, LOWERBOUND+1, LOWERBOUND+2, ..., UPPERBOUND for each iteration
         if (((number % 3 == 0) || (number % 5 == 0) || (number % 7 == 0)) && ((number % 15 != 0) || (number %21 != 0) || (number % 35 != 0) || (number %105 != 0))) {  // Even
            sumEven += number;   // Same as sumEven = sumEven + number
         }
         ++number;  // Next number
	  }
      // Print the result
      System.out.println("The sum is " + (sumEven));
   }
   
		public static void years() {
      final int LOWERBOUND = 999;
      final int UPPERBOUND = 2010;
      int sumEven = 0;    // For accumulating even numbers, init to 0
      int number = LOWERBOUND;
      while (number <= UPPERBOUND) {
            // number = LOWERBOUND, LOWERBOUND+1, LOWERBOUND+2, ..., UPPERBOUND for each iteration
         if (((number % 4 == 0) && (number % 100 != 0)) || (number % 400 == 0)) {  // Even
            ++sumEven;   // Same as sumEven = sumEven + number
         }
         ++number;  // Next number
	  }
      // Print the result
      System.out.println("The leap years is " + (sumEven));
   }
   
  public static void main(String[] args) {  // Program entry point
      System.out.println("Hello, world!");   // Print text message
	  System.out.println(" ");
	  checker();
	  System.out.println(" ");
	  carre();
	  System.out.println(" ");
	  triangular();
	  System.out.println(" ");
	  etoile();
	  System.out.println(" ");
	 mouton();
	 System.out.println(" ");
	 sum();
	 System.out.println(" ");
	 rectangle();
	 System.out.println(" ");
	 cylindre();
	 System.out.println(" ");
	 arithmetic();
	 System.out.println(" ");
	 finale();
	 System.out.println(" ");
	 even();
	 System.out.println(" ");
	 years();
   }
}
