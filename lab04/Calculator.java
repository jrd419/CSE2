//Jacob Dooley
//Lab 4
//Making a Calculator
//Doing one of several functions for inputs a & b

//First import the scanner
import java.util.Scanner;

//The class that has the calculator
public class Calculator{
    
    public static void main(String[] args){
        
        //This will establish the variable that I will use
        //to refrence the scanner
        Scanner myScanner = new Scanner(System.in);
        
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
    }
}