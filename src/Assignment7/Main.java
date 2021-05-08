package Assignment7;

interface unicycle {
    void balance();
    }
interface bicycle {
    void show();
}
interface tricycle {
    void display();
}

interface AllInterfaces extends unicycle,bicycle,tricycle {
    void displayALl();
}

class SimpleClass
{
    void nothing()
    {
        System.out.println("just nothing class");
    }
}
class SuperClass extends SimpleClass implements AllInterfaces
{


    @Override
    public void balance() {
        System.out.println("just balance");
    }

    @Override
    public void show() {
        System.out.println("just show");
    }

    @Override
    public void display() {
        System.out.println("just display");
    }

    @Override
    public void displayALl() {
        System.out.println("all interfaces");
    }

    void uni(unicycle ref){
        ref.balance();

    }
    void bi(bicycle ref){
        ref.show();
    }

    void tri(tricycle ref){
        ref.display();
    }

    void all(AllInterfaces ref){
        ref.displayALl();
    }
}
public class Main
{
    public static void main(String[] args)
    {
        SuperClass ref=new SuperClass();

        ref.uni(ref);
        ref.bi(ref);
        ref.tri(ref);
        ref.all(ref);
    }
}










