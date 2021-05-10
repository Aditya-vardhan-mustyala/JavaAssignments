package Assignment7.part5;

public class Main
{
    public static void main(String[] args)
    {
        OuterClass1 obj1 = new OuterClass1();
        obj1.new InnerClass1("hello").method();

        OuterClass2 obj2 = new OuterClass2();
        OuterClass2.Innerclass2 ref2 = obj2.new Innerclass2();
        ref2.method();
    }
}
