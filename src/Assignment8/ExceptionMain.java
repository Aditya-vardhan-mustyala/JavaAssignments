package Assignment8;


class Myexception1 extends Exception
{
    Myexception1(String text)
    {
        super(text);
    }
}

class Myexception2 extends Exception
{
    Myexception2(String text)
    {
        super(text);
    }
}
class Myexception3 extends Exception
{
    Myexception3(String text)
    {
        super(text);
    }
}

class ThrowException
{
    public void Throw(char choose) throws Myexception1, Myexception2, Myexception3
    {
        if(choose=='1')
            throw new Myexception1("this is exception1");
        else if(choose=='2')
            throw new Myexception2("this is exception2");
        else if(choose=='3')
            throw new Myexception3("this is exception3");
        else
            throw new NullPointerException();
        //above is written to produce null pointer exception

    }
}

public class ExceptionMain
{
     public static void main(String[] args)
     {
         ThrowException example=new ThrowException();
         try
         {
             example.Throw('2');
         }
         catch (Exception e)
         {
             System.out.println(e.getMessage());
         }
         finally
         {
             System.out.println("this is finally block");
         }
     }
}
