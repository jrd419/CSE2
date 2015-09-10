//Check Program
//Jacob Dooley
//This program will take a check and show the
// cost, percentage tip, and the ways to split
// the check

import java.util.Scanner;

//I don't know what ^ up there does
//Oh well

public class Check{
//Again, no idea what ^ that means, or why the name is the 
// name that it is

//Regardless, now I'll enter the main method\
    public static void main(String[] args){
        
        //OHHHHHHH. I think the scanner thing is a method give an input
        //Thats cool, this line should allow that
        Scanner myScanner = new Scanner( System.in);
        
        //This prints the prompt to accept the input
        System.out.println("Enter the origanal cost in the form XX.XX: ");
        
        //This will accept the input
        double checkCost = myScanner.nextDouble();
        
        //Now the same thing, but for the tip
        System.out.println("Enter the percentage tip that you wish to pay as a whole number (in the form XX): ");
        double tipPercent = myScanner.nextDouble();
        
        //This will put the integer tip into a decimal form
        tipPercent /= 100;
        
        //This will split the check depending on how many people went out for dinner
        System.out.println("Enter the number of people who went out to dinner: ");
        int numPeople = myScanner.nextInt();
        
        //This will create the varibles to do the calculations that show up in the program
        double totalCost;
        double costPerPerson;
        
        //These will store the different values for dollars, dimes, and pennies
        //I think
        int dollars, dimes, pennies;
        
        //These are the calculations for the tip
        totalCost = checkCost*(1 + tipPercent);
        costPerPerson = totalCost/numPeople;
        dollars = (int) costPerPerson;
        dimes = (int) (costPerPerson*10)%10;
        pennies = (int) (costPerPerson*100)%10;
        
        //This will print the answer to who owes what
        System.out.println("Each person in the group owes $" + dollars + '.' + dimes + pennies);
    }

}