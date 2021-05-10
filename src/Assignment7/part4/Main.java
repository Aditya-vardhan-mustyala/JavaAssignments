package Assignment7.part4;

public class Main
{
    public static void main(String[] args)
    {
        Cycle uni=UniFactory.make();
        uni.price();
        Cycle bi=BiFactory.make();
        bi.price();
        Cycle tri=Trifactory.make();
        tri.price();

    }
}
