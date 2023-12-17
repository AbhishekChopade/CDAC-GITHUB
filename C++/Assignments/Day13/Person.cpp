// Design inheritance hierarchy for following (for at least one) and implement it. Write a small program to demonstrate the use.
// - Computer printers
// - Bank accounts
// - Different type of persons - Student, Employee, Artist.



#include<iostream>
#include<cstring>
using namespace std;

class Person{
    string perName;
    int perAge;
    string perAddress;

    public:
    Person(){
        cout<<"Person's default constructor \n";
    }

    Person(string name, int age, string address):perName(name),perAge(age),perAddress(address){
        cout<<"\nPerson's parametrized constructor \n";
        this->perName = name;
        this->perAge = age;
        this->perAddress = address;
    }

    string getName(){
        return perName;
    }
    ~Person(){
       cout<<"Person's destructor \n"; 
    }
    // void setPersonData(string name,int age,string address){
    //     this->perName = name;
    //     this->perAge = age;
    //     this->perAddress = address;
    //}
    void getPersonData(){
        cout<<"name = "<<perName<<"\n"<<"age = "<<perAge<<"\n"<<"address = "<<perAddress<<"\n";
    }
};

class Student : public Person{
   int studRollNo;
   float studMarks;
   public:
   Student() {
        cout<<"Student's default constructor \n";
   }
   Student(string name,int age, string address, int roll,float marks) : Person(name,age,address),studRollNo(roll),studMarks(marks)  {
        cout<<"Student's parametrized constructor \n";
        this->studRollNo = roll;
        this->studMarks = marks;
   }

   
   void study(){
        cout<<"Student "<<getName()<<" is studying \n";
   }
   ~Student(){
       cout<<"Student's destructor \n"; 
   }
   void getStudentData(){
       getPersonData();
      cout<<"roll = "<<studRollNo<<"\n"<<"marks = "<<studMarks<<"\n";
   }

};

class Employee : public Person{
   int empId;
   float empSalary;
   public:
   Employee() {
        cout<<"Employee's default constructor \n";
   }
   Employee(string name,int age, string address, int id,float sal) : Person(name,age,address), empId(id),empSalary(sal)  {
        cout<<"Employee's parametrized constructor \n";
        this->empId = id;
        this->empSalary = sal;
   }

   
   void work(){
        cout<<"Employee "<<getName()<<" is working \n";
   }
   ~Employee(){
       cout<<"\nEmmployee's destructor \n"; 
    }
   void getEmployeeData(){
      getPersonData();
      cout<<"id = "<<empId<<" , "<<"salary = "<<empSalary<<'\n';
   }

};

int main(){
    Person p1("Ram",22,"Pune");
    cout<<"\nPerson p1 details : \n";
    p1.getPersonData();

    Student s1("Yash",21,"Thane",101,89.97);
    cout<<"\nStudent s1 details : \n";
    s1.getStudentData();
    s1.study();

    Employee e1("Akash",34,"Mumbai",1001,25000);
    cout<<"\nEmployee s1 details : \n";
    e1.getEmployeeData();
    e1.work();

}