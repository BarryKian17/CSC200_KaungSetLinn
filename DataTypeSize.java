/**********************************************************************
  
  Program Title : Demonstrating Variable Data Types in Java with Sizes
  File Name: "DataTypeSize.java"
  
  Programmer : Sathish Sarma
  Contact Details : sathish.sarma@newinti.edu.my
  Date : 28 August 2025
  
 **********************************************************************/

public class DataTypeSize {
    public static void main(String[] args) {
        System.out.println("Demonstrating Data Type Size in Java");
        System.out.println("-----------------------------------------");
        
        byte b = 120;
        short s = 32000;
        int i = 123456789;
        double d = 19.99;
        char c = 'A';
        long l = 9876543210L;
        float f = 5.75f;
		
		//Instruction
		System.out.println("This application shows the basic code that is needed to calculate data type size, the range (min & max value) for each data type.\n");
		
		//Finding data type size using BYTES
		System.out.println("The Variable b is bytes data type has the value of " + b + "\nSize of bytes: " + Byte.BYTES + " bytes.");
		System.out.println("Size of bytes: " + Byte.SIZE + " bytes.\n");
		
		System.out.println("The Variable s is short data type has the value of " + s + "\nSize of short: " + Short.BYTES + " bytes.");
		System.out.println("Size of short: " + Short.SIZE + " bytes.\n");
		
		System.out.println("The Variable i is int data type has the value of " + i + "\nSize of int: " + Integer.BYTES + " bytes.");
		System.out.println("Size of int: " + Integer.SIZE + " bytes.\n");
		
		System.out.println("The Variable c is Character data type has the value of " + c + "\nSize of char: " + Character.BYTES + " bytes.");
		System.out.println("Size of char: " + Character.SIZE + " bytes.\n");
		
		System.out.println("The Variable d is Double data type has the value of " + d + "\nSize of double: " + Double.BYTES + " bytes.");
		System.out.println("Size of double: " + Double.SIZE + " bytes.\n");
				
		System.out.println("The Variable l is Long data type has the value of " + l + "\nSize of long: " + Long.BYTES + " bytes.");
		System.out.println("Size of long: " + Long.SIZE + " bytes.\n");
		
		System.out.println("The Variable f is Float data type has the value of " + f + "\nSize of float: " + Float.BYTES + " bytes.");
		System.out.println("Size of float: " + Float.SIZE + " bytes.\n");
		

		//Finding data type range minimum and maximum value
		System.out.println("Minimum value of int range: " + Integer.MIN_VALUE + ".");
		System.out.println("Maximum value for double range: " + Double.MAX_VALUE + ".");
		
		
		
		
        
    }
}