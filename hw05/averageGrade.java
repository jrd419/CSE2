//Jacob Dooley
//10.1.15
//Calculating the Average Grade

import java.util.Scanner;

public class averageGrade{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        
        //This variable is for the grade that users will enter an input
        double grade = 0;
        
        //This variable will total all of the grades to eventually find the average
        //It is set equal to -999 because that grade entered will count as a vaild grade,
        //so this will counter that, so that 999 added cancels out to 0
        double total = -999;
        
        //This variable will incriment to find the total number of grades entered
        //It is equal to -1 because the trigger 999 will count as a grade, this
        //counters that so that the average is correctly calculated
        int n = -1;
        
        //This will prompt the user to enter information for the program
        //I realize its a little sloppy because it's all on one line
        //But I learned how to use that in my Engineering Class and I
        //Want to see it work here too
        System.out.println("This program will calculate the average \npercentage of your grade. Enter numbers between \n0-100 for your grade. Entering 999 will calculate \nthe average grade of all previous grades.\n");
        
        //This is the loop that will continue until 999 is entered
        while(grade != 999){
            
            //This is where you can input the grades
            grade = myScanner.nextDouble();
            
            //This will prompt the user if they enter an invalid number that
            //is not 999, b/c that is the trigger number
            if((grade < 0 || grade > 100) && grade != 999){
                System.out.println("The grade you entered is invalid, punk.");
            }
            
            //This will run the rest of the program if the number entered
            //is valid. It sums the total and incriments the number of grades
            else{
                total = total + grade;
                n++;
            }
        }
        double average = total/n;
        
        System.out.println("Your average grade is " + average + "%.");
        
        
    }
}