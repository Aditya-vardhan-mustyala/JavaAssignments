package Assignment7.part4;

public class Tricycle implements Cycle
{
    Tricycle()
    {
        System.out.println("This is ticycle object");
    }

    @Override
    public void price()
    {
        System.out.println("tricycle price is 3000");
    }
}
