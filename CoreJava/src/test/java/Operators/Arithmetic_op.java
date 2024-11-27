package Operators;

 // Arithmetic operators is used to perform the mathmetical caluculatin on numarical datatypes like int , float, double

public class Arithmetic_op {
  
   public static void main(String[] args) {
	 
		    
		        int a = 10;
		        int b = 3;

		        // Addition
		        int addition = a + b;
		        System.out.println("Addition: " + addition);  // 10 + 3 = 13

		        // Subtraction
		        int subtraction = a - b;
		        System.out.println("Subtraction: " + subtraction);  // 10 - 3 = 7

		        // Multiplication
		        int multiplication = a * b;
		        System.out.println("Multiplication: " + multiplication);  // 10 * 3 = 30

		        // Division
		        int division = a / b;
		        System.out.println("Division: " + division);  // 10 / 3 = 3 (integer division)

		        // Modulus
		        int modulus = a % b;
		        System.out.println("Modulus: " + modulus);  // 10 % 3 = 1 (remainder)

		        // Floating-point Division
		        double floatDivision = (double) a / b;
		        System.out.println("Floating-point Division: " + floatDivision);  // 10.0 / 3 = 3.33333...
		    }
		
}
