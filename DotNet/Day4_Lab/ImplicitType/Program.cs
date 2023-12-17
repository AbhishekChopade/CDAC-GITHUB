namespace ImplicitType
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //can only be used for local variables, not for class level variables,
            //not for func parameters or return values
            //int i = 100;
            var i = 100;  //implicit variable

            //var j;  //error

            var s = 124.3;
            //s = ""; //error
            s = 100;

            int a = 100;
            var b = 100;

            Console.WriteLine(s.GetType());
        }
    }
}