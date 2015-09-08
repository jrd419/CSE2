//hw02
//Jacob Dooley
//Walmart Shopping Trip

public class Arithmetic{
    public static void main(String[] args){
        
        //when assigning variables I am going to stay away from using "s"
        //because I know that will confuse me later
        
        //quantity of pairs of jeans bought
        int jean = 4;
        //cost per pair of jeans
        double jean$ = 19.99d;
        
        //quantity of candles bought
        int candle = 6;
        //cost per candle
        double candle$ = 3.49d;
        
        //quantity of pens bought
        int pen = 9;
        //cost per pen
        double pen$ = 1.29d;
        
        //create a sales tax
        double tax = 0.06d;
        //the 1 in front of the decimal tax will make it easier to calculate
        //the total cost later
        
        //now i'll find in the total costs of each item
        //to do this i'll multiply the quantity by the cost
        double totaljean = jean*jean$;
        double totalcandle = candle*candle$;
        double totalpen = pen*pen$;
        
        //this will calculate the tax per item
        double tjean = totaljean*tax;
        double tcandle = totalcandle*tax;
        double tpen = totalpen*tax;
        
        //now I have to emliminate the extra decimal places
        
        //first I'll multiple everything by 100 and convert it to a decimal
        int tajean = (int) (tjean*100);
        int tacandle = (int) (tcandle*100);
        int tapen = (int) (tpen*100);
        //then I'll divide the previous by 100.00 to get the two decimal places
        double taxjean = tajean/100.00d;
        double taxcandle = tacandle/100.00d;
        double taxpen = tajean/100.00d;
        
        //these will calculate the total cost without tax and total tax
        double acost = totaljean + totalcandle + totalpen;
        double alltax = taxjean + taxcandle + taxpen;
        
        //for some reason the total cost before tax is being stupid
        //so I'm going to do the same thing I did to the tax
        int alcost = (int) (acost*100);
        double allcost = alcost/100.00d;
        
        //now I can calculate the total cost
        double totalcost = allcost + alltax;
        
        //this will print the receipt
        //also, everything is printing with howevermany decimals they want
        //I do not know how to fix this...
        // :|
        //like seriously I trying to look it up and the things I'm finding
        //aren't making sense
        System.out.println("");
        System.out.println("WELCOME    TO    WALMART");
        System.out.println("------------------------");
        System.out.println("------------------------");
        System.out.println("# ITEM            $$$$$$");
        System.out.println("");
        System.out.println(jean + " JEANS @         $" + jean$);
        System.out.println("    TOTAL         $" + totaljean);
        System.out.println("    TAX            $" + taxjean);
        System.out.println("");
        System.out.println(candle + " CANDLES @        $" + candle$);
        System.out.println("    TOTAL         $" + totalcandle);
        System.out.println("    TAX            $" + taxcandle);
        System.out.println("");
        System.out.println(pen + " PENS @           $" + pen$);
        System.out.println("    TOTAL         $" + totalpen);
        System.out.println("    TAX            $" + taxpen);
        System.out.println("------------------------");
        System.out.println("TOTAL W/O TAX    $" + allcost);
        System.out.println("TOTAL TAX         $" + alltax);
        System.out.println("TOTAL COST       $" + totalcost);
        System.out.println("------------------------");
        System.out.println("------------------------");
        System.out.println("////////////////////////");
        System.out.println("/////// THANKYOU ///////");
        System.out.println("/// HAVE A GREAT DAY ///");
        System.out.println("////////////////////////");
        System.out.println("");
    }
}