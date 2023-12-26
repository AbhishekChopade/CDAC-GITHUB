namespace Inheritance
{
    internal class Program
    {
        static void Main()
        {
            Class1 o = new Class1();
            o.Display();
            o.Insert();


            //method 2
            IDbFunctions oIDb;
            oIDb = o;
            oIDb.Insert();

            //method 3
            ((IDbFunctions)o).Insert();


            //method 4
            (o as IDbFunctions).Insert();
        }
    }
    public interface IDbFunctions
    {
        void Insert();
        void Update();
        void Delete();
    }

    public class Class1 : IDbFunctions
    {
        public void Display()
        {
            Console.WriteLine("display from class1");
        }
        public void Delete()
        {
            Console.WriteLine("idb.delete from class1");
        }
        public void Insert()
        {
            Console.WriteLine("idb.Insert from class1");
        }
        public void Update()
        {
            Console.WriteLine("idb.update from class1");
        }
    }

}

namespace Interfaces2
{
    internal class Program
    {
        static void Main()
        {
            Class1 o = new Class1();
            o.Display();
            o.Insert();

            //method 2
            IDbFunctions oIDb;
            oIDb = o;
            oIDb.Insert();
            oIDb.Delete();

            IFileFunctions oIFile;
            oIFile = o;
            oIFile.Open();
            oIFile.Delete();

            //method 3
            ((IDbFunctions)o).Insert();


            //method 4
            (o as IDbFunctions).Insert();
        }
    }

    public interface IDbFunctions
    {
        void Insert();
        void Update();
        void Delete();
    }
    public interface IFileFunctions
    {
        void Open();
        void Close();
        void Delete();
    }
    public class Class1 : IDbFunctions, IFileFunctions
    {
        public void Display()
        {
            Console.WriteLine("display from class1");
        }
        void IDbFunctions.Delete()
        {
            Console.WriteLine("idb.delete from class1");
        }

        void Delete()
        {
            Console.WriteLine("idb.delete from class1");
        }
        public void Insert()
        {
            Console.WriteLine("idb.Insert from class1");
        }
        public void Update()
        {
            Console.WriteLine("idb.update from class1");
        }

        //void IFileFunctions.Open()
        //{
        //    Console.WriteLine("ifile.Open from class1");
        //}

        //void IFileFunctions.Close()
        //{
        //    Console.WriteLine("ifile.Close from class1");
        //}

        void IFileFunctions.Delete()
        {
            Console.WriteLine("ifile.Delete from class1");
        }

        public void Open()
        {
            Console.WriteLine("ifile.Open from class1");
        }

        public void Close()
        {
            Console.WriteLine("ifile.Close from class1");
        }
    }

}