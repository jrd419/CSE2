import java.util.Scanner;
public class arrays{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int n = myScanner.nextInt();
        System.out.println("Array values");
        int []list = new int[n];
        int sum = 0;
        for(int i = 0; i < list.length; i++){
            list[i] = (int)(Math.random()*100);
            System.out.println(list[i]);
            sum += list[i];
        }
        int average = sum/n;
        System.out.println("Average =" + average);
        for(int w = 0; w < list.length; w++){
            if(list[w] < average){
            }
            else{
                System.out.println(list[w]);
            }
        }
    }
}