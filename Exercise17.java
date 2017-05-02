/*
* Name: David Rodriguez
* Section: COSC/ITSE 1336
* Homework: Excercise 17
* Description: accepts two integer parameters and 
*       returns their average as a floating point number.
*/

/*
* -------------------------------PSUDO CODE---------------------------------------------
*   1) Create a main
*      (a) create an array with three specific spots 
*           (i) call out the first two spaces and give them user input to put in a double integer.
*           (ii) create an  0uation that takes the two numbers and creates an average.
*           (iii) create an if statement that says if a third number is entered to add all double integers together and display the average of them all. 
*---------------------------------------------------------------------------------------
*/

import java.util.Scanner;
import java.util.*;

public class Exercise17{

public static void main (String [] Args){

//Creates new scanner that allows for userinput
    Scanner scnnrUserInput = new Scanner (System.in);

//Code that sets variables for array
    float fltFirstNumber = 0.0f;
    float fltSecondNumber = 0.0f;
    float fltNumberCounter = 0;
    float sum = 0;
    float average = fltFirstNumber/sum;
    final float size = 6f;
    float fltinput = 1;
    Float quit = 0f;
    
//Displays the numbers inputed 



   
    for (int intIndex = 0; intIndex < size; intIndex++){
            float[] aryNumbers = {fltFirstNumber,fltSecondNumber,0.0f,0.0f,0.0f};
System.out.println("Please enter a number to display in array you wish to get the average of. \nIf you wish to stop press 0. "+ Arrays.toString(aryNumbers));
                        fltFirstNumber = scnnrUserInput.nextFloat();
                        fltNumberCounter++;
                            


            System.out.println("Please enter the second number to display in array you wish to get the average of. \nIf you wish to stop press 0. "+ Arrays.toString(aryNumbers));
                        fltSecondNumber = scnnrUserInput.nextFloat();
                        fltNumberCounter++;
                        sum   = fltFirstNumber + fltSecondNumber;
                        average = sum/fltNumberCounter;
            
            System.out.println("This is the average of the numbers you entered"+ average +"\nIf you wish to stop press 0\n" + Arrays.toString(aryNumbers));
                    if(fltFirstNumber== quit && fltSecondNumber == quit){
                        System.out.println("\n\n\nGoodbye.");
                        break;
                        
                    }
            }

        }
}
