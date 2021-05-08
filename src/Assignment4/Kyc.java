package Assignment4;


import java.util.*;
import java.util.logging.*;

public class Kyc
{

    static Logger logger=Logger.getLogger("Kyc.class");
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int testCases=sc.nextInt();

        for(int i=0;i<testCases;i++)
        {
            String joining= sc.next();
            String curr=sc.next();
            RangeOfDates example1 = new RangeOfDates(joining);
            logger.info(example1.calculateRange(curr));

        }
    }
}
