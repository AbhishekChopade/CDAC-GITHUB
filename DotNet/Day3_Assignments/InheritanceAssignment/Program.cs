using System.Xml.Linq;

namespace InheritanceAssignment
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Manager manager = new Manager("Ajay",1,51000,"M");
            GeneralManager generalManager = new GeneralManager("Ram", 2, 100000, "GM", "Flat");
            CEO ceo = new CEO("Om", 1, 123000);

            Console.WriteLine("Hello, World!");
        }
    }


    public interface IDbFunctions
    {
        public void insert();
        public void delete();
        public void update();
    }


    public abstract class Employee : IDbFunctions
    {
        private static int idGenerator;
      
       

        string name; //-> no blank names should be allowed
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

        private int empNo;
        public int EmpNo
        {
            get { return empNo; }
        }

        protected decimal basic;// -> must be between some range
        public abstract decimal Basic
        {
          get; set;
            
        }

        private short deptNo;// -> must be > 0
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

        public Employee(string Name="default", short DeptNo = 1, decimal Basic = 25000)
        {
            this.empNo = idGenerator++;
            this.Name = Name;
            this.DeptNo = DeptNo;
            this.Basic = Basic;
        }
        public abstract decimal CalcNetSalary();

        public new void insert()
        {
            Console.WriteLine("in Employee class insert method ");
        }

        public new void delete()
        {
            Console.WriteLine("in Employee class delete method");
        }

        public new void update()
        {
            Console.WriteLine("in Employee class update method");
        }

    }

    public class Manager : Employee,IDbFunctions
    {
       private string designation;
        public string Designation
        {
            get { return designation; }
            set
            {
                if (string.IsNullOrEmpty(value))
                    Console.WriteLine("designation is empty ");
                else
                    designation = value;
            }
        }

        public override decimal Basic
        {
            get { return basic; }
            set {
                if(value <10000 || value>100000)
                    Console.WriteLine("Invlaid Basic salary ");
                else
                    basic = value; }
        }
        public Manager(string Name = "default", short DeptNo = 1, decimal Basic = 25000,string Designation = "Manager") : base(Name, DeptNo, Basic)
        {
            this.Designation = designation;
        }

        public override decimal CalcNetSalary()
        {
            return Basic * 2;
        }

        public new void insert()
        {
            Console.WriteLine("in Manager class insert method ");
        }

        public new void delete()
        {
            Console.WriteLine("in Manager class delete method");
        }

        public new void update()
        {
            Console.WriteLine("in Manager class update method");
        }

    }

    public class GeneralManager : Manager
    {
        private string perks;
        public string Perks
        {
            get { return perks; }
            set { perks = value; }
      
        }

        public override decimal Basic
        {
            get { return basic; }
            set
            {
                if (value < 50000 || value > 150000)
                    Console.WriteLine("Invlaid Basic salary ");
                else
                    basic = value;
            }
        }
        public GeneralManager(string name, short deptNo, decimal basic, string designation,string perks) : base(name, deptNo, basic, designation)
        {
            this.Perks = perks;
        }

        public override decimal CalcNetSalary()
        {
            return Basic + 20000;
        }

        public new void insert()
        {
            Console.WriteLine("in GeneralManager class insert method ");
        }

        public new void delete()
        {
            Console.WriteLine("in GeneralManager class delete method");
        }

        public new void update()
        {
            Console.WriteLine("in GeneralManager class update method");
        }

    }

    public class CEO : Employee,IDbFunctions
    {
        public override decimal Basic
        {
            get { return basic; }
            set
            {
                if (value < 200000)
                    Console.WriteLine("Invlaid Basic salary ");
                else
                    basic = value;
            }
        }
        public CEO(string Name, short DeptNo, decimal Basic) : base(Name, DeptNo, Basic)
        {
            
        }

        public sealed override decimal CalcNetSalary()
        {
            return Basic * 3;
        }

        public new void insert()
        {
            Console.WriteLine("in CEO class insert method ");
        }

        public new void delete()
        {
            Console.WriteLine("in CEO class delete method");
        }

        public new void update()
        {
            Console.WriteLine("in CEO class update method");
        }
    }



}
