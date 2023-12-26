// 42. Write a class Employee for an application which will have data members for employee id,
// employee name and salary. Provide the following functionalities in Employee class.
// 1. Initialing objects using default and parameterized constructors.
// 2. Accepting and displaying the information of employee from console
// class Employee
// {

// int emp_id;
// char emp_name[20];
// double salary;
// public:
// Employee();
// Employee(int, char*, double);
// void Accept();
// void Display();
// };
// In &quot;main&quot; function declare an array of Employee objects. Write a menu driven program to -
// a. Insert record into an array.
// b. Update information of specific employee on the basis of emp_id accepted from user
// c. Display all records.

#include<iostream>
#include<cstring>
using namespace std;

class Employee{
    int emp_id;
    char emp_name[20];
    double salary;
    public:
    Employee();
    Employee(int, char*, double);
    void Accept();
    void Display();
    int getId();
    void Update();
};
Employee::Employee(){

}
Employee::Employee(int id, char* n, double s){
    emp_id =id;
    strcpy(emp_name,n);
    salary = s;
}
void Employee::Accept(){
    cout<<"Enter info of an employee : "<<endl;
    cin>>emp_id>>emp_name>>salary;
}
void Employee::Display(){
    cout<<emp_id<<" "<<emp_name<<" "<<salary<<endl;
}

int Employee::getId(){
    return emp_id;
}
void Employee::Update(){
    cout<<"Enter name and salary : "<<endl;
    cin>>emp_name>>salary;
}
int main(){
    Employee e[10];
    int cnt = 0;
    int choice;
    int id;
    while(true){
        cout<<"1. Insert info of an employee"<<endl;
        cout<<"2. Update info of an employee"<<endl;
        cout<<"3. Display all records"<<endl;
        cout<<"4. Exit"<<endl;
        cin>>choice;
        switch(choice){
            case 1:
                e[cnt++].Accept();
                break;
            case 2:
                cout<<"Enter id of an employee to be updated = "<<endl;
                cin>>id;
                for(int i=0;i<cnt;i++){
                      if(id==e[i].getId())
                      {
                        e[i].Update();
                      }
                }
              
                break;
            case 3:
                for(int i=0;i<cnt;i++){
                    e[i].Display();
                }
                break;
            case 4:
                exit(0);
                break;
        }
    }
}