namespace EmployeeArr
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //Employee[] empArr = new Employee[3];
            //empArr[0] = new Employee("Abc", 1, 25000);
            //empArr[1] = new Employee("Xyz", 2, 14000);
            //empArr[2] = new Employee("Def", 3, 24000);
            //decimal maxSalary = 0;
            //int index = 0;

            //for (int i = 0; i < empArr.Length; i++)
            //{
            //    Console.WriteLine(empArr[i].EmpNo);
            //}
            //for (int i = 0; i < empArr.Length; i++)
            //{
            //    if (empArr[i].Basic > maxSalary)
            //    {

            //        maxSalary = empArr[i].Basic;
            //        index = i;
            //    }

            //}
            //Console.WriteLine("Employee with highest salary : ");
            //Console.WriteLine(empArr[index].toString());

            //Console.WriteLine("Enter the EmpNo to Searched = ");
            //int no = Convert.ToInt32(Console.ReadLine());
            //Console.WriteLine("Employee details = " + empArr[no].toString());


            Employee.InvalidBasic += Emp_InvalidBasic;
            Employee emp = new Employee("Abc", 1, 20000);
            //Employee.InvalidBasic += Emp_InvalidBasic; 

        }

        private static void Emp_InvalidBasic(string mesg)
        {
            Console.WriteLine("Event Handled "+mesg+" successfully");
        }
    }

    public delegate void EmployeeDelegate(String mesg);
    public class Employee
    {
        public  static event EmployeeDelegate InvalidBasic;

        private static int idGenerator;
        string name; //-> no blank names should be allowed
        int empNo;
        decimal basic;// -> must be between some range
        short deptNo;// -> must be > 0

        public string Name
        {
            get { return name; }
            set
            {
                if (string.IsNullOrEmpty(value))
                    Console.WriteLine("Name is empty ");
                else
                    name = value;
            }
        }

        public int EmpNo
        {
            get { return empNo; }
        }

        public decimal Basic
        {
            get { return basic; }
            set
            {
                if (value > 10000 && value <= 40000)
                    basic = value;
                else
                {
                    if (InvalidBasic != null)
                        InvalidBasic("Invalid Basic Salary");
                }
                 

            }
        }

        public short DeptNo
        {
            get { return deptNo; }
            set
            {
                if (value < 0)
                    Console.WriteLine("Invalid deptNo");
                else
                    deptNo = value;
            }
        }
        static Employee()
        {
            idGenerator = 1;
        }

        public Employee(string Name, short DeptNo, decimal Basic)
        {
            this.empNo = idGenerator++;
            this.Name = Name;
            this.DeptNo = DeptNo;
            this.Basic = Basic;
        }
        public decimal getNetSalary()
        {
            decimal netSalary = Basic + 15000;
            return netSalary;
        }

        public string toString()
        {
            return "EmpNo = " + EmpNo + ", Name = " + Name + ", DeptNo = " + DeptNo + ", Basic = " + Basic;
        }
    }
}