using Maths;
namespace Employee
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Employee o1 = new Employee("Amol", 123465, 10);
            Employee o2 = new Employee("Amol", 100000);
            Employee o3 = new Employee("Amol");
            Employee o4 = new Employee();
            //o3.Name = "";
            /*  Employee o1 = new Employee();
              Employee o2 = new Employee();
              Employee o3 = new Employee();*/


          /*  Console.WriteLine("EmpNo = "+  o1.EmpNo + ", Net salary = " + o1.GetNetSalary() + ", Name = " + o1.Name + ", DeptNo = " + o1.DeptNo);
            Console.WriteLine("EmpNo = " + o2.EmpNo + ", Net salary = " + o2.GetNetSalary() + ", Name = " + o2.Name + ", DeptNo = " + o2.DeptNo);
            Console.WriteLine("EmpNo = " + o3.EmpNo + ", Net salary = " + o3.GetNetSalary() + ", Name = " + o3.Name + ", DeptNo = " + o3.DeptNo);
            Console.WriteLine("EmpNo = " + o4.EmpNo + ", Net salary = " + o4.GetNetSalary() + ", Name = " + o4.Name + ", DeptNo = " + o4.DeptNo);*/
           
          
        }
    }

    public class Employee
    {
         private string name;
         public string Name
        {
            get { return name; }  
            set { 
                if(string.IsNullOrEmpty(value))
                {
                    Console.WriteLine("Name is Invalid");
                }
                else
                    name = value;
            }
        }
        private int empNo;
        public int EmpNo
        {
            get { return empNo; }

        }
        private decimal basic;
        public decimal Basic
        {
            get { return basic; }
            set 
            {
                if (value > 100000 && value <= 200000)
                    basic = value;
                else
                    Console.WriteLine("Should be in given Range ");
            }
        }

        private short deptNo;
        public short DeptNo
        {
           get{ return deptNo; }
           set {
                if (value < 0)
                    Console.WriteLine("Invalid DeptNo");
                else
                    deptNo = value;  }
        }

        static int autoId;

       /* public Employee() {
            empNo = autoId++;
        }*/

        public Employee(String name=null,decimal basic=0, short deptNo=0)
        {
            empNo = autoId++;
            this.name = name;
            this.basic = basic;
            this.deptNo = deptNo;
        }

        static Employee()
        {
            autoId = 1;
        }

        public decimal GetNetSalary()
        {
            decimal netSalary = Class1.GetNetSalary(1000);

            return netSalary;
        }
    }

}