import java.util.Scanner;
public class MineSweeper{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        
        //This will be the size of the MineSweeper block
        //and the next lines make sure they are in the parameters
        System.out.println("Enter a size between 1 & 30 for the field - ");
        int size = myScanner.nextInt();
        while(size < 1 || size > 30){
            System.out.println("Please enter a number between 1 & 30 - ");
            size = myScanner.nextInt();
        }
        
        //This creates the 2D array that will be the field
        //and for simplicity sake I am going to add a border around the field
        //so that the same method can be used to count the mines surrounding
        //a single location
        int [][]field = new int[size + 2][size + 2];
        
        //This is the user input for the mines
        //and again the next lines make sure it is in the parameters
        System.out.println("Enter the number of mines between 1 & " + size*size + " - ");
        int mines = myScanner.nextInt();
        while(mines < 1 || mines > size*size){
            System.out.println("Please enter a number between 1 & " + size*size + " - ");
            mines = myScanner.nextInt();
        }
        
        //This incriments to place all the mines at random x & y locations
        int count = 0;
        while(count < mines){
            int x = (int)(Math.random()*size);
            int y = (int)(Math.random()*size);
            
            //The + 1 makes sure that the mines are placed within the border
            //and in this case, 0 is a blank space and -1 is a mine, so 
            //that when I go to incriment all the spaces later I have something
            //that is different from all of the other spaces
            while(field[x + 1][y + 1] == 0){
                field[x + 1][y + 1] = -1;
                count++;
            }
        }
        
        //This is the double for loop that will incriment the values of the spaces
        //between all of the mines, and I didn't know how else to do this, so 
        //I just did ever configuration around the spaces as if statements,
        //also this is the reason that I added a border around my field
        for(int i = 1; i < field.length - 1; i++){
            for(int j = 1; j < field.length - 1; j++){
                if(field[i][j] != -1){
                    if(field[i - 1][j - 1] == -1){
                        field[i][j] += 1;
                    }
                    if(field[i][j - 1] == -1){
                        field[i][j] += 1;
                    }
                    if(field[i + 1][j - 1] == -1){
                        field[i][j] += 1;
                    }
                    if(field[i + 1][j] == -1){
                        field[i][j] += 1;
                    }
                    if(field[i + 1][j + 1] == -1){
                        field[i][j] += 1;
                    }
                    if(field[i][j + 1] == -1){
                        field[i][j] += 1;
                    }
                    if(field[i - 1][j + 1] == -1){
                        field[i][j] += 1;
                    }
                    if(field[i - 1][j] == -1){
                        field[i][j] += 1;
                    }
                }
            }
        }
        
        //Another double for loop to print all of the values
        //again keeping in mind the border
        for(int i = 1; i < field.length - 1; i++){
            for(int j = 1; j < field.length - 1; j++){
                
                //This is why I choose to represent mines as -1
                //and also  I added extra spaces to print so that the field
                //printed more as a square and less as a rectangle
                if(field[j][i] == -1){
                    System.out.print(" M ");
                }
                
                //This will print the count for mines at each location
                else if(field[j][i] != 0){
                    System.out.print(" " + field[j][i] + " ");
                }
                
                //I choose this variable to represent a safe space because
                //it kinda stands out while blending in, and it makes the
                //field and the mines easier to see
                else{
                    System.out.print("[X]");
                }
            }
            
            //This puts it on the next line
            System.out.println("");
        }
    }
}