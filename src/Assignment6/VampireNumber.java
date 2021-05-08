package Assignment6;

import java.util.logging.*;

public class VampireNumber
{
    static Logger logger = Logger.getLogger("VampireNumber.class");
    public static void main(String[] args)
    {
        int count=0,number=0;
        VampireNumber instance=new VampireNumber();
        while (count<100)
        {
            if(instance.isVampire(number))
            {
                logger.info(String.valueOf(number));
                count++;
            }
            number++;
        }

    }

    public boolean isVampire(int number)
    {
        int numberOfNonZeroDigits=getNumberOfNonZeroDigits(number);
        int lengthOfNumber=getLength(number);

        if(lengthOfNumber%2!=0)
            return false;

        if(lengthOfNumber==2 && numberOfNonZeroDigits==2)
            return true;

        return numberOfNonZeroDigits >= 3;
    }

    private int getLength(int number)
    {
        String num=String.valueOf(number);
        return num.length();
    }

    private int getNumberOfNonZeroDigits(int number)
    {
        String num=String.valueOf(number);
        int nonZeroCount=0;
        for(int index=0;index<num.length();index++)
        {
            if(num.charAt(index)!='0')
                nonZeroCount++;
        }

        return nonZeroCount;
    }
}
