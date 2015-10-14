//Jacob Dooley
//Lab 7
//Print an X in the *'s
import java.util.Scanner;
public class encrypted_x{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        
        //This will prompt the user for an input
        System.out.print("Enter the side length that you want your X to have - ");
        int size = myScanner.nextInt();
        System.out.println("\n");
        
        //These are the variables that I will manipulate in the loops
        int a;
        int b;
        
        //This is the for loop that will print the x in the *'s
        //Message from much much MUCH later, this was a ridiculus
        //amount of trial and error :(
        //This will print the top half of the x
        for(a = 1; size > a*2; a++){
            for(b = 1; a > b; b++){
                System.out.print("*");
            }
            System.out.print(" ");
            for(b = (size/2)+a; size > b; b++){
                System.out.print("**");
            }
            System.out.print(" ");
            for(b = 1; a > b; b++){
                System.out.print("*");
            }
            System.out.println("");
        }
        
        //I origanlly thought I needed this part
        //I do not
        /*if(size % 2 != 0){
            for(b = 1; size > b*2; b++){
                System.out.print("*");
            }
            System.out.print("  ");
            for(b = 1; size > b*2; b++){
                System.out.print("*");
            }
            System.out.println("");
        }*/
        
        //This will print the bottom half of the x
        for(a = 1; size > a*2; a++){
            for(b = size; b > 2*a; b--){
                System.out.print("*");
                b--;
            }
            System.out.print(" ");
            for(b = 1; a > b; b++){
                System.out.print("**");
            }
            System.out.print(" ");
            for(b = size; b > 2*a; b--){
                System.out.print("*");
                b--;
            }
            System.out.println("");
        }
        System.out.print(" ");
        for(a = 1; size > 2*a; a++){
            System.out.print("**");
        }
        System.out.println(" ");
    }
}