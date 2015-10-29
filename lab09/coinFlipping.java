import java.util.Scanner;
import java.util.Random;
public class coinFlipping{
    
    //This will be the orginal coin flipping method
    public static void flip(){
        
        //I found online that this is 
        //how you call a random variable
        Random toss = new Random();
        int coinFlip = toss.nextInt()%2;
        
        //This initilizes the heads and tails variables
        int heads = 0;
        int tails = 0;
        
        //This will give the value to the heads/tails count
        if(coinFlip == 0){
            heads++;
        }
        else{
            tails++;
        }
        
        //This prints the result
        System.out.println("Heads = " + heads + "\nTails = " + tails);
    }
    
    //This is the other method, that does multiple flips
    public static void flip(int count){
        
        //This is programed the same as the last method
        //with a couple extra flips in it
        int heads = 0;
        int tails = 0;
        
        //This calls for the first method when
        //when the user only wants one flip
        if(count == 0){
            flip();
        }
        
        //This is the alternative if there are more flips
        else{
            
            //This will keep the coin flipping for however
            //many times the user calls for
            while(count > 0){
                Random toss = new Random();
                int coinFlip = toss.nextInt()%2;
                if(coinFlip == 0){
                    heads++;
                }
                else{
                    tails++;
                }
                count--;
            }
            System.out.println("Heads = " + heads + "\nTails = " + tails);
        }
    }
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
         
        //This will prompt the user to enter the number of flips
        //I'm not going to give the prompt 0-100, because the 
        //program can do much larger numbers
        System.out.print("Enter the number of times you want to flip a coin - ");
        int count = myScanner.nextInt();
        
        if(count < 0 || count > 100){
            System.out.println("Invalid Input");
        }
        else{
            flip(count);
        }
    }
}