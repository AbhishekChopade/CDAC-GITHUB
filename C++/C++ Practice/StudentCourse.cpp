#include<iostream>
#include<vector>
using namespace std;

class Course{
    string courseName;
    double courseFees;

    public:
    //Course(){}

    Course(string name,double fees):courseName(name),courseFees(fees){
        courseName = name;
        courseFees = fees;
    }

    string getCourseName(){
        return courseName;
    }
    double getCourseFees(){
        return courseFees;
    }


};

class Student{
    string studentName;
    int rollNo;
    string mobileNo;
    vector<Course*> courses;

    public:
    //Student(){}

    Student(string name,int roll,string mobile):studentName(name),rollNo(roll),mobileNo(mobile){
        studentName = name;
        rollNo = roll;
        mobileNo = mobile;
    }

    void acceptStudent(){
        cout<<"Enter the student name,roll no , mobile no : "<<endl;
        cin>>studentName>>rollNo>>mobileNo;
    }

    void displayDetails(){
        cout<<"studentName = "<<studentName<<","<<"rollNo = "<<rollNo<<","<<"mobileNo = "<<mobileNo<<endl;
    }

    void takeCourse(Course* course){
        courses.push_back(course);
    }

    void displayCourseDetails(){
        if(courses.size()==0){
            cout<<"No courses taken yet"<<endl;
        }

        cout << "Courses taken by " << studentName << ":" << endl;
        for (Course* course : courses) {
            cout << "Course Name: " << course->getCourseName() << ", Fees: " << course->getCourseFees() << endl;
        }

    }
    

    int getRollNO(){
        return rollNo;
    }
    string getStudentName(){
        return studentName;
    }
    string getMobileNo(){
        return mobileNo;
    }

};




int  main(){
    vector<Student*> students;
    vector<Course*> courses;

    courses.push_back(new Course("PG-DAC",90000));
    courses.push_back(new Course("PG-DBDA",106000));
    courses.push_back(new Course("PG-VLSI",120000));

    int choice;
    bool exit = false;
    int count = 0;
    while(!exit){
        cout<<"1. Register Student"<<endl;
        cout<<"2. Take Couse"<<endl;
        cout<<"3. Display specific students's taken courses"<<endl;
        cout<<"4. Display all students and their courses registerd"<<endl;
        cout<<"5. Exit"<<endl;
        cout<<"Enter your choice"<<endl;
        cin>>choice;
        switch(choice){
            case 1:{//Register Student
                string name, mobile;
                int rollno;
                cout << "Enter Name: ";
                cin >> name;
                cout << "Enter Roll No: ";
                cin >> rollno;
                cout << "Enter Mobile: ";
                cin >> mobile;
                students.push_back(new Student(name, rollno, mobile));
                //students.push_back(new Student("Om",123,"9378123902"));
                
                break;
            }
            case 2://Take Course{}
                int studentIndex,courseIndex;
                cout<<"Enter the student index  = "<<endl;
                cin>>studentIndex;
                cout<<"Enter the course index = "<<endl;
                cin>>courseIndex;
                students[studentIndex]->takeCourse(courses[courseIndex]);
                break;

            case 3://Display specific students's taken courses
            int index;
            cout<<"Enter the index"<<endl;
            cin>>index;
            students.at(index)->displayCourseDetails();
            // for(int i=0;i<students.size();i++){
            //     if(students.getRollNo()==roll)

            // }
                break;

            case 4://Display all students and their courses registerd
            for(Student* s1:students){
                s1->displayDetails();
                s1->displayCourseDetails();
            }
        
                break;
            case 5://Exit
                exit = true;
                break;
            default:
                cout<<"Invalid choice"<<endl;

        }

    }


}


