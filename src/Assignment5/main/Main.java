package Assignment5.main;

import Assignment5.data.DefaultInitialization;
import Assignment5.singleton.SingletonClass;

public class Main
{
    public static void main(String[] args)
    {
        DefaultInitialization obj1 = new DefaultInitialization();
        obj1.getMembers();
        obj1.localVariables();

        SingletonClass obj2 = SingletonClass.createInstance("aditya");
        obj2.getString();
    }

}
