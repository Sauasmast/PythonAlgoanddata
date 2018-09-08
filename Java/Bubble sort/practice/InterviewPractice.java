package interview.practice;

import java.util.Scanner;

/**
 *
 * @author Saugat Dahal
 * Simple challenge of Udemy where the array is entered and sorted with the
 * bubble sort algorithms.
 */
public class InterviewPractice {

    /**
     * @param args the command line arguments
     * 
     * 
     */
    public static void main(String[] args) {
        System.out.println("Please Enter the amount of the numbers to include on an array");
        Scanner keyboard = new Scanner(System.in);
        int number_of_items   = keyboard.nextInt();
        int[] number = new int[number_of_items];
        
        for (int i =0; i<= number_of_items-1 ;i++){
            number[i] = keyboard.nextInt();
        }
        
        Arrayclass arrays = new Arrayclass(number);
        
        System.out.println("All the arrays are :" + arrays.getIntegers());
        arrays.printArray();
        System.out.println("=====================================");
        arrays.sortIntegers();
        
    }
    
}
