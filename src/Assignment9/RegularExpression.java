package Assignment9;

import java.util.Scanner;
import java.util.logging.Logger;
import java.util.regex.*;

public class RegularExpression
{
    public static void main(String[] args)
    {
        Logger logger= Logger.getLogger("RegularExpression.class");
        Scanner sc=new Scanner(System.in);
        String sentence=sc.next();
        if(Pattern.matches("^[A-Z].*\\.$", sentence))
            logger.info("Sentence is according to pattern");
        else
            logger.info("sentence DOESNOT follow pattern");
    }
}
