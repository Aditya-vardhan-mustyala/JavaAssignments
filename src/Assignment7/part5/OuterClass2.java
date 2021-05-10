package Assignment7.part5;

public class OuterClass2
{
    OuterClass2()
    {
        System.out.println("outerclass 2");
    }

    public class Innerclass2 extends OuterClass1.InnerClass1
    {
        Innerclass2()
        {
            new OuterClass1().super("hi");
            System.out.println("this is inner2");
        }

        @Override
        public void method() {
            System.out.println("method of 2");
        }
    }
}
