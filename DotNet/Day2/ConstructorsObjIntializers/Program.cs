namespace ConstructorsObjIntializers
{
    internal class Program
    {
        static void Main(string[] args)
        {
            // Class1  o = new Class1 { i = 10, j = 20, k = 30 };
            Class1 o = new Class1(11, 22, 33);
            Console.WriteLine(o.i+" "+o.j+" "+o.k);
        }
    }


    public class Class1 {
       public  int i, j, k;

        public Class1()
        {
            Console.WriteLine("in def ctor"); 
        }

        public Class1(int i,int j, int k )
        {
            Console.WriteLine("in param ctor");

            this.i = i;
            this.j = j;
            this.k = k;
        }

    }

}