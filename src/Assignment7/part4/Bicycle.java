package Assignment7.part4;

public class Bicycle implements Cycle
{
    Bicycle()
    {
        System.out.println("This is bicycle object");
    }

    @Override
    public void price()
    {
        System.out.println("bicycle price is 2000");
    }
}
