//Jacob Dooley
//9/15/15
//Lets Make a Timer to Dinner Time: Because Everyone Loves Food

//Import the Scanner, you know so that this works
import java.util.Scanner;

//Now I'll make a class specific to the timer, because that'll be good practice
public class Timer{
    
    //I still dont know why I have to do this next part
    //if I already made a class above, but I'll figure it out
    
    public static void main(String[] args){
        
        //I think this next part prompts the program that theres a 
        //scanner that it has to be aware of. Like defining a variable
        //for a function
        Scanner myScanner = new Scanner(System.in);
        
        //This text will prompt the user to enter the information nessassary
        System.out.println("Using military time enter the current time in hours HH and then minutes MM -");
        
        //This will accept the users input for the current time
        int ctimeh = myScanner.nextInt();
        int ctimem = myScanner.nextInt();
        //I don't know how to accept the information like the homework instrucitons
        //show so that I can then split the first two didgets from the last two to get
        //minutes separate from hours. Sorry
        
        //This text will promt the user to enter what time they plan to eat dinner
        System.out.println("Using military time enter the time of dinner in the same fashion as above -");
        
        //Lets accept the input now
        int dtimeh = myScanner.nextInt();
        int dtimem = myScanner.nextInt();
        
        //Now I have to find the difference between the two times
        //but an hour is 60 minutes, so time to figure that out...
        
        //Lets put the minutes over 60, substract them, and multiply by 60 to get the right time
        //WAIT! But then if the answer is negative then I have to subtract an hour
        //Lets also do that...
        
        //These will define the values in the if then statements
        int timeleftm;
        int minutes;
        
        //I hope this will solve the above problems aka, negative minutes
        //Basically it will make it so that the larger number is always subtracted by the
        //smaller of the two numbers, and then how the program should handle that
        //if it dips below 0.
        if (ctimem > dtimem){
            timeleftm = ctimem - dtimem;
            minutes = 60 - timeleftm;
        }
        else{
            timeleftm = dtimem - ctimem;
            minutes = timeleftm;
        }
        
        //Real quick program the hours left
        int timelefth = dtimeh - ctimeh;
        
        //Now this statement should subtract one from the hour depending
        //on whether or not the minutes are negative
        if (ctimem > dtimem){
            timelefth -= 1;
        }
        else{
            timelefth *= 1;
        }
        
    //Now I'll print the final text displaying how much time is left
    System.out.println("You have " + timelefth + " hours and " + minutes + " minutes until dinner.");
    
    }
}
