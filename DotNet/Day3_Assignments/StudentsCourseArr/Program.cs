namespace StudentsCourseArr
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter the number  of batches :");
            int n = Convert.ToInt32(Console.ReadLine());
           
            StudentBatches[][] studentBatches = new StudentBatches[n][];
            for(int i = 0; i < studentBatches.Length; i++) 
            {
                Console.WriteLine($"Enter the number  of students for batch {i+1} : ");
                int m = Convert.ToInt32(Console.ReadLine());
                studentBatches[i] = new StudentBatches[m];

                for (int j = 0; j < studentBatches[i].Length; j++)
                {
                    Console.WriteLine("Enter the marks for student [{0}][{1}] : ",i,j);
                    studentBatches[i][j] = new StudentBatches(Convert.ToInt32(Console.ReadLine()));
                }
            }

            Console.WriteLine();

            for(int i = 0;i < studentBatches.Length; i++)
            {
                for(int j = 0; j < studentBatches[i].Length; j++)
                {
                    Console.WriteLine("Marks of student {0} {1} : {2} ", i, j, studentBatches[i][j].Marks);
                }
            }

        }
    }

    public class StudentBatches
    {
        public int Marks { get; set; }
       
        public  StudentBatches(int Marks) 
        { 
            this.Marks = Marks;
        }    
    }



}
