//10.06.15
//Make a Pyramid
//Jacob Dooley

import java.util.Scanner;
public class pyramid{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        
        //This will be the users input the size of the pyramid
        System.out.print("Enter the size that you want to make your pyramid - ");
        int size = myScanner.nextInt();
        
        //This will allow me to change to quantify the size in the loop, without
        //damaging the original variable
        int num = size;
        
        //This variable is the variable that will be constantly changing in the
        //loop, so I don't have to give it a magnitude
        int tier;
        
        //This will make sure that the number entered was postive.
        //If it is it will start the program
        if(size >= 1){
            
            //This will be the loop for the pyramid
            while(size >= 1){
                
                //So this is for the spaces before the pryamid is built
                for(tier = 1;tier <= size; tier++){
                    System.out.print(" ");
                }
                
                //These are the "blocks" for the pyramid
                for(tier = num; tier > size; tier--){
                    System.out.print("**");
                }
                
                //Here I'll print one more block b/c there is an odd number of blocks
                //in each row
                System.out.println("*");
                
                //This will decriment the size of the pyramid so that the
                //program eventually stops
                size--;
            }
        }
        //These are just error statements
        else if(size == 0){
            System.out.println("Wow, you entered zero...");
        }
        else if(size <= 0){
            System.out.println("Wow, you entered a negative number...");
        }
        
    }
}