namespace EventHandling
{
    internal class Program
    {


        static void Main(string[] args)
        {
            Console.WriteLine("Hello, World!");

            Class1 o = new Class1();
            o.InvalidEvent += EvenHandling;
            o.P1 = 101;

          



        }

        private static void EvenHandling(string msg)
        {
            Console.WriteLine(msg);
        }

        public void EventMethod(string msg)
        {
            Console.WriteLine(msg); 
        }
    }



    public delegate void Del(string msg);
    public class Class1
    {
        public event Del InvalidEvent;


        private int p1;
        public int P1
        {
            get
            {
                return p1;
            }
            set
            {
                if (value < 100)
                    p1 = value;
                else
                {
                    //step 3 : raise the event whenever you want to 
                    InvalidEvent("Invalid value of p1");
                }
            }
        }

    }
}