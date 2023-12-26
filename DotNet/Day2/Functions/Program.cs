namespace Functions
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Class1 o = new Class1();
            Console.WriteLine(o.Add(1, 2, 3));
            Console.WriteLine(o.Add(a:10,15));
        }

        static void Main1(string[] args)
        {
            Class1 o = new Class1();
            o.DoSomething();

        }
    }

    public class Class1
    {
        public void Display()
        {
            Console.WriteLine("Display");
        }

        public void Display(String s)
        {
            Console.WriteLine("Dispaly " + s);
        }

        public int Add(int a=0,int b=0,int c = 0)
        {
            Console.WriteLine("in Add "+ a+" "+b+" "+c);
            return a + b + c;
        }
        public int Add2(int a, int b = 0, int c = 0)
        {
            Console.WriteLine("in Add2 ");
            return a + b + c;
        }

        public void DoSomething()
        {
            int i = 100;

            void DoSomething2()
            {
                i++;
                Console.WriteLine(++i);
            }
            DoSomething2();
        }


    }
}