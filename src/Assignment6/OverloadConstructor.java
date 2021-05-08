package Assignment6;

public class OverloadConstructor
{
    String name;
    public OverloadConstructor()
    {
        this("aditya");
    }

    public OverloadConstructor(String name)
    {
        this.name = name;
        System.out.println("argument passed is "+name);
    }

    public static void main(String[] args)
    {
        OverloadConstructor[] array;

        /*
        when only reference is created no constructor is called as no new object is created
        constructed is called only when an object is created as below
        */

        array=new OverloadConstructor[2];
        //objects are not created above , an array with the size to store the objects is created in heap
        //but the objects is array are to be created
        array[0]=new OverloadConstructor();
        array[1]=new OverloadConstructor("hello");

    }
}

