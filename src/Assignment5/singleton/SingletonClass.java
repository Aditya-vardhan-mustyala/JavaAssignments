package Assignment5.singleton;

import java.util.logging.*;
public class SingletonClass
{
    String stringMember;
    static Logger logger = Logger.getLogger("SingletonClass.class");

    public static SingletonClass createInstance(String variable)
    {
        /*
        stringMember=variable;

        non static members(instance variables )cannot be accessed directly from static methods
        as static method are associated with whole class(to all instances) and non-static members are associated with a specific instance

         */
        return new SingletonClass();
    }

    public void getString()
    {
        logger.info(stringMember);
    }
}
