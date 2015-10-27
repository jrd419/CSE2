import java.util.Scanner;
public class areas{
    
    //These will be the various area methods.
    //The way that they will be told apart is with the
    //number of inputs.
    //Also, I used doubles instead of integers b/c they are more accurate...
    public static void area(double radius){
        
        //This will calculate the area based on the input.
        double a = 3.14*radius*radius;
        
        //This will print the area.
        System.out.println("Area = " + a);
    }
    public static void area(double length, double width){
        double a = length*width;
        System.out.println("Area = " + a);
    }
    
    //The next two methods will do the same thing.
    public static void area(double base1, double base2, double height){
        double a = .5*(base1 + base2)*height;
        System.out.println("Area = " + a);
    }
    
    //This is the main method that will take the inputs
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        
        //This will be a variable that will keep the program in a loop
        //until the correct input is entered
        int n = 0;
        
        //This will prompt the user to enter a character to identify the type of shape
        //That will then enable a switch statement to execute the program
        //The while statement keeps this running until n = 1
        while(n != 1){
        System.out.println("What shape would you like to \n calculate the area of?\n Enter 'c' for a circle, 'r' for a rectangle,\n or 't' for a trapazoid");
        System.out.println("To quit the program enter 'q'");
        char shape = myScanner.next().charAt(0);
        switch(shape){
            case'c':
                
                //This prompts the user to enter the radius input
                System.out.println("What is the radius?");
                double radius = myScanner.nextDouble();
                
                //Then this calls to the area method, and because there is only
                //one input, it will automatically calculate for a circle
                area(radius);
                
                //This will incriment n so that it equals 1 and the program terminates
                n++;
                break;
                
            //These next two cases do the same things as teh previous statment
            case'r':
                System.out.println("What is the length?");
                double length = myScanner.nextDouble();
                System.out.println("What is the width?");
                double width = myScanner.nextDouble();
                area(length, width);
                n++;
                break;
            case't':
                System.out.println("What is base 1?");
                double base1 = myScanner.nextDouble();
                System.out.println("What is base 2?");
                double base2 = myScanner.nextDouble();
                System.out.println("What is the height?");
                double height = myScanner.nextDouble();
                area(base1, base2, height);
                n++;
                break;
            case 'q':
                
                //This incriments n, so that the user can quit the program
                n++;
                System.out.println("Goodbye");
                break;
            default:
                
                //Notice how this doesn't incriment n, so if a correct input isn't
                //entered, then the while loop continues
                System.out.println("Please enter a correct input.");
        }
        }
    }
}