
// Jacob Dooley
// Lab 2
// Create a Cyclometer
// In that sense, create a program that displays the miles traveled
// for each trip, and the total miles traveled. Also the counts and
// time that the trip took in minutes.

public class Cyclometer {
    public static void main(String[] args) {
        
        // There was never a specific intrstruction saying not to use nice
        // number so I hope this is ok
        
        //first I'll display the ammount of time that the trip took
        int timetrip1seconds = 360;
        int timetrip2seconds = 1200;
        
        //next I'll display the number of counts, which imagine are turns
        //of the bike wheels
        int counttrip1 = 1600;
        int counttrip2 = 5000;
        
        //these will be the bike constants
        float wheeldiameterinches = 24;
        float pi = 3.1415f;
         
         //these will be constants thats corralate to distance & time
         //I want to do it differently than the example to see if it 
         //would sitll work
         int inch = 1;
         int foot = 12*inch;
         int mile = 5280*foot;
         int second = 1;
         int minute = 60*second;
         
         //this will print the text on the cyclometer
         System.out.println("The first trip took " + timetrip1seconds/minute + " minutes and had a total of" + counttrip1 + " counts.");
         System.out.println("The second trip took " + timetrip2seconds/minute + " minutes and had a total of" + counttrip2 + " counts.");
         
         //this will calculate the trips distance
         //it should come out to 120,633.6 inches or 10,052.8 feet or 1.9 miles for Trip 1
         //for trip two it should come out to 376,980 inches or 31,415 feet or 5.95 miles
         //the math used for this is the circ. of the wheel diameter*pi multiplied by the
         //number of counts that the wheel went around
         //then the different length measurements are added by dividing the previous
         //number by the conversion
         //I realize how the below is redundant, I just wanted the practice, and to see if it would work
         float distancetrip1inches = (wheeldiameterinches*counttrip1*pi);
         float distancetrip2inches = (wheeldiameterinches*counttrip2*pi);
         float distancetrip1feet = distancetrip1inches/foot;
         float distancetrip2feet = distancetrip2inches/foot;
         float distancetrip1miles = distancetrip1feet/mile;
         float distancetrip2miles = distancetrip2feet/mile;
         float totaldistanceinches = distancetrip1inches+distancetrip2inches;
         float totaldistancefeet = distancetrip1feet+distancetrip2feet;
         float totaldistancemiles = distancetrip1miles+distancetrip2miles;
         
         System.out.println("You traveled " + distancetrip1miles + " miles on your first trip.");
         System.out.println("You traveled " + distancetrip2miles + " miles on your second trip.");
         System.out.println("You traveled a total distance of " + totaldistancemiles + " miles.");
         System.out.println("Good job and congratulations!");
         
         //we couldn't get some of the spaces to appear after the numbers
    }
}