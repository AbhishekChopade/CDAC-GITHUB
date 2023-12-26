namespace Static
{
    internal class Program
    {
        static void Main(string[] args)
        {
            /*Class1 c1 = new Class1();
            Class1.j = 10;*/
            Console.WriteLine("Hello, World!");
            Class1.DisplayStatic();
           
        }
    }


    public class Class1
    {
        public int i;
        public static int j;

        public void Display()
        {
            Console.WriteLine("non - static = " + i);
            Console.WriteLine("static = " + j);
        }

        public static void DisplayStatic()
        {
            Console.WriteLine("static = " + j);
            //Console.WriteLine("non - static = " + i);
        }

        private int prop1;
        private int Prop1
        {
            get { return prop1; }
            set { prop1 = value; }
        }

        private static int prop2;
        private static int Prop2
        {
            get { return prop2; }
            set { prop2 = value; }

        }

        public Class1()
        {
            Console.WriteLine("In non-static ctor");
        }

        static Class1()
        {
            Console.WriteLine("In static ctor");
        }
    }

}