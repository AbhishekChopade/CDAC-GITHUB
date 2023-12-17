namespace ArrayNList
{
    internal class Program
    {
        static void Main(string[] args)
        {

            
            Console.WriteLine("Enter the length of an array : ");
            int[] arr = new int[Convert.ToInt32(Console.ReadLine())];

            for(int i=0; i<arr.Length; i++)
            {
                Console.WriteLine($"Enter the element at position {i} : ");
                arr[i] = Convert.ToInt32(Console.ReadLine());
            }

            Console.WriteLine();

            List<int> arrlist = new List<int>();
/*
            for (int i = 0; i < arr.Length; i++)
            {
                arrlist.Add(arr[i]);
                
               
            }*/
            arrlist.AddRange(arr);


            Console.WriteLine("Array List :");
            foreach (int i in  arrlist)
            {
                Console.WriteLine(i);
            }
        }
    }
}