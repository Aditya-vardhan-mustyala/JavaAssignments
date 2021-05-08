package Assignment7;


class Cycle
{
    Cycle()
    {
        System.out.println("this is cycle constructor");
    }
}

class Unicycle extends Cycle
{
    Unicycle()
    {
        System.out.println("this is Unicycle constructor");
    }

    public void balance()
    {
        System.out.println("balance of Unicycle");
    }
}

class Bicycle extends Cycle
{
    Bicycle()
    {
        System.out.println("this is Bicycle constructor");
    }

    public void balance()
    {
        System.out.println("balance of bicycle");
    }
}

class Tricycle extends Cycle
{
    Tricycle()
    {
        System.out.println("this is Tricycle constructor");
    }
}
public class DynamicMethodDispatch
{
    public static void main(String[] args)
    {
        Cycle[] cycles=new Cycle[3];
        cycles[0]=new Unicycle();
        cycles[1]=new Bicycle();
        cycles[2]=new Tricycle();
        /*upcasting is implicit
        for(Cycle ref:cycles)
            ref.balance();
        above method cannot be called as balance is not in cycle class
        */

        Unicycle uni=(Unicycle)cycles[0];
        Bicycle bi=(Bicycle)cycles[1];
        Tricycle tri=(Tricycle)cycles[2];

        //downcasting should be done explicitly else compilation error

        uni.balance();
        bi.balance();
        /*tri.balance();
        above statement doesnt work as no balance method in tricycle
         */
    }
}
