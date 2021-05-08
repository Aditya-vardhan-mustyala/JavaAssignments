package Assignment5.data;

import java.util.logging.*;
public class DefaultInitialization
{
    static Logger logger = Logger.getLogger("DefaultInitialization.class");
    int anInteger;
    char aCharecter;

    public void getMembers()
    {
        logger.info(String.format("{} , {}",anInteger,aCharecter));
    }

    public void localVariables()
    {
        int a;
        char b;
        /*
         logger.info(String.format("values of a and b without initialization are {} , {}",a,b));

         above line cannot be executed because the local variables are initialized
         */

    }
}
