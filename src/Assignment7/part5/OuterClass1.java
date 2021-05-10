package Assignment7.part5;

public class OuterClass1
{
    OuterClass1()
    {
        System.out.println("in outer1");
    }

    public class InnerClass1
    {
        public InnerClass1(String str)
        {
            System.out.println("this is inner1 constructor with argument passed: "+str);
        }

        public void method()
        {
            System.out.println("method1");
        }
    }
}
