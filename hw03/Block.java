//Jacob Dooley
//9/15/15
//Dimensions of a Block
//I am very bad a spelling, so that is probably the incorrect spelling

//import the scanner
import java.util.Scanner;

//create the class for the block program
public class Block{
    
    //Create the scanners class
    //^ thats probably not specifcally what happens
    //but this is the class where the scanning will happen
    public static void main(String[] args){
        
        Scanner myScanner = new Scanner(System.in);
        
        //These will prompt and recieve the dimensions of the block 
        //from the user
        System.out.println("This program will find the volume and SA of a block");
        System.out.println("Enter the length of the block -");
        double l = myScanner.nextDouble();
        System.out.println("Enter the width of the block -");
        double w = myScanner.nextDouble();
        System.out.println("Enter the height of the block -");
        double h = myScanner.nextDouble();
        
        //Lets calculate the things (area and surface area)
        double SA = l*w*2 + l*h*2 + w*h*2;
        double volume = l*w*h;
        
        //This will print the answer to the area and SA of the block
        System.out.println("The surface area = " + SA);
        System.out.println("The volume = " + volume);
    }
}
