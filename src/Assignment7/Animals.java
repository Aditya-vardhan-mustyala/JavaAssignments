package Assignment7;

abstract class Rodent
{

    public abstract void nativeTo();

    public void color()
    {
        System.out.println("general rodent color is Grey");
    }
}

class Mouse extends Rodent
{
    Mouse()
    {
        System.out.println("This is Mouse class");
    }

    public void nativeTo()
    {
        System.out.println("native place of mouse is Asia");
    }
}

class Gerbil extends Rodent
{

    Gerbil()
    {
        System.out.println("This is gerbil class");
    }

    public void nativeTo()
    {
        System.out.println("native place of mouse is Turkmenistan");
    }

    public void color()
    {
        System.out.println("Gerbil color is white");
    }


}

class Hamster extends Rodent
{
    Hamster()
    {
        System.out.println("This is hamster class");
    }

    public void nativeTo()
    {
        System.out.println("native place of mouse is syria");
    }

    public void color()
    {
        System.out.println("Gerbil color is brown");
    }

}

public class Animals
{
    public static void main(String[] args)
    {
        Rodent[] array=new Rodent[3];
        array[0]=new Hamster();
        array[1]=new Mouse();
        array[2]=new Gerbil();
        System.out.println();
        for(Rodent obj: array)
        {
            obj.nativeTo();
            obj.color();
            System.out.println();

        }

    }
}