//Jacob Dooley
//Lab 5
//Making a Special Calculator
//Doing one of several functions for inputs a & b
//Preform the program until prompted to stop with 'n' or 'N'

//First import the scanner
import java.util.Scanner;

//The class that has the calculator
public class CalculatorSpecial{
    
    public static void main(String[] args){
        
        //This will establish the variable that I will use
        //to refrence the scanner
        Scanner myScanner = new Scanner(System.in);
        
        //This will define the variable that the while statement will
        //use to determine whether or not the program should continue
        char end = 'y';
        
        //This is the loop that basically says as long as the user doesn't
        //enter n or N the calculator will act on a loop
        while(end != 'n' && end != 'N'){
            
        //This will prompt the user to what the program is
        //and what they have to do to use the program
        System.out.println("CALCULATOR");
        System.out.println("Enter two integer values for a calculation -");
        
        //These lines will allow the user to input their numbers
        int a = myScanner.nextInt();
        int b = myScanner.nextInt();
        
        //This will allow the user to specify addition, subtraction,
        //multiplication or division
       
        System.out.println("In put one of the symbols + - * or / to specify your function -");
        char operator = myScanner.next().charAt(0);
        
        //This will establish the answer variable
        double answer;
        
        switch (operator){
            case '+':
                answer = a + b;
                System.out.println(a + " + " + b + " = " + answer);
                break;
            case '-':
                answer = a - b;
                System.out.println(a + " - " + b + " = " + answer);
                break;
            case '*':
                answer = a * b;
                System.out.println(a + "*" + b + " = " + answer);
                break;
            case '/':
                answer = (double) a / b;
                System.out.println(a + "/" + b + " = " + answer);
                break;
            default:
                System.out.println("Enter a correct variable + - * or /");
            }
            //This is the prompt for the user to either enter n/N to end the program
            //or any other character to continue the program
            System.out.println("Would you like to quit the calculator? Enter n if so.");
            System.out.println("Otherwise enter any other character(s)");
                end = myScanner.next().charAt(0);
         }
        
    }
}