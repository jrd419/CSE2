import java.util.Scanner;
public class move_array{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int size;
        size = myScanner.nextInt();
        try{
            int []a = new int[size - 1];
        }
        catch(Exception e){
            System.out.println("Enter a number greater than 0");
            System.exit(0);
        }
        int [] array = new int[size];
        for(int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random()*100);
            System.out.print(array[i] + " ");
        }
        System.out.println("");
        int move;
        move = myScanner.nextInt();
        try{
            int [] a = new int[move -1];
            int [] b = new int[size];
            b[move - 1] = 0;
        }
        catch(Exception e){
            System.out.println("Enter a number between 0 & " + array.length);
        }
        int a = array[move];
        for(int i = move; i < array.length - 1; i++){
            array[i] = array [i + 1];
        }
        array[array.length - 1] = a;
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println("");
        }
    }
