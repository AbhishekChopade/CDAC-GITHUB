using System.Data;

namespace HelloWorld
{
    internal class Program
    {

     

        static void Main(string[] args)
        {
            Console.Write("Good Morning ");
            System.Console.WriteLine("Hello, World!");
            String s1 = "abcd";
            Class1 c1 = new Class1(s1);
            Class1 c2 = new Class1();
            System.Console.WriteLine("Addition = " + Class1.add(5,10,50));
            System.Console.WriteLine("Addition = " + Class1.add(5, 10));
            System.Console.WriteLine("Addition = " + c1.add(5));
            System.Console.WriteLine("addition = " + c1.add(5, 25));
            System.Console.WriteLine("addition = " + Class1.add(10));
            System.Console.WriteLine("addition = " + Class1.add(10));

        }


        public  class Class1
        {
            String s;
            public Class1()
            {
                Console.WriteLine("in ctor of Class1");
            }

            public Class1(String s1)
            {
                s = s1;
                Console.WriteLine("in param ctor of Class1 "+s);
            }

            ~ Class1()
            {
                Console.WriteLine("in dtor of Class1");
            }

            public static int add(int a=0,int b=0,int c=0)

            {
                System.Console.WriteLine("In 3 args static add");
                return a + b + c;
            }

            public  int add(int a)

            {
                System.Console.WriteLine("In 1 arg non static add");
                return a;
            }

            public int add(int a,int b)
            {
               
                System.Console.WriteLine("In 2 args  non static add");
                return a + b;
            }
        }
    }
}