import java.util.Scanner;
public class timeSheets{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        
        //This defines the total of the number of employees
        int totalemp = -1;
        
        //This will allow me to add up to whatever number of employees
        //Tough to explain, you'll see
        int emp = 1;
        
        //This will represent the hours worked on M-F
        //There's probably am easier way to do this but eh...
        double M = -1;
        double T = -1;
        double W = -1;
        double Th = -1;
        double F = -1;
        
        //This will represent the total hours worked
        double hours = 0;
        
        //This will represent the employees wages
        double wage = -1;
        
        //This will represent the total pay for each employee
        double pay = 0;
        
        //This will represent the total pay that you the owner owe to the employees
        double totalpay = 0;
        
        //This will loop so that the user enters a correct input
        while(totalemp < 0){
            //This will prompt the user to enter the total number of employees
            System.out.println("How many employees worked this week?");
            totalemp = myScanner.nextInt();
            
            //If the number is negative this comes up
            if(totalemp < 0){
                System.out.println("Please enter a positive number, \nno negative people work here.");
            }
        }
        
        //This will ask the user for the employees information
        while(emp <= totalemp){
            
            //This will incriment the employee number, asking for the respective
            //employee's information
            
            //This will get the employee's wages
            //It also won't let peopel enter negative numbers
            System.out.println("What are employee " + emp + "'s wages?");
            System.out.println("(Enter the information in terms of cents, instead of dollars and cents)");
            while(wage < 0){
                wage = myScanner.nextDouble();
                if(wage < 0){
                    System.out.println("Please enter a positive number!");
                }
            }
            
            //This will get the employee's hours
            //It also won't allow people to enter negative numbers
            System.out.println("How many hours did employee" + emp + "work on each of these days?");
            System.out.println("Monday-");
            while(M < 0){
                M = myScanner.nextDouble();
                if(M < 0){
                    System.out.println("Please enter a positive number!");
                }
            }
            System.out.println("Tuesday-");
            while(T < 0){
                T = myScanner.nextDouble();
                if(T < 0){
                    System.out.println("Please enter a positive number!");
                }
            }
            System.out.println("Wednesday-");
            while(W < 0){
                W = myScanner.nextDouble();
                if(W < 0){
                    System.out.println("Please enter a positive number!");
                }
            }
            System.out.println("Thursday-");
            while(Th < 0){
                Th = myScanner.nextDouble();
                if(Th < 0){
                    System.out.println("Please enter a positive number!");
                }
            }
            System.out.println("Friday-");
            while(F < 0){
                F = myScanner.nextDouble();
                if(F < 0){
                    System.out.println("Please enter a positive number!");
                }
            }
            
            //This will calculate how many hours were worked and
            //how much that employee made that week
            hours = M + T + W + T + F;
            pay = hours*wage;
            System.out.println("Employee " + emp + " worked " + hours + " hours and made $" + pay/100 + ".");
            
            //This will slowly calculate how much you as the employer
            totalpay = totalpay + pay;
            
            //This will reset the hours and wages and incriment the employee number
            wage = -1;
            M = -1;
            T = -1;
            W = -1;
            Th = -1;
            F = -1;
            emp++;
        }
        
        //This will print the final pay of the employee
        System.out.println("You owe $" + totalpay/100 + " this week to your employees.");
    }  
}