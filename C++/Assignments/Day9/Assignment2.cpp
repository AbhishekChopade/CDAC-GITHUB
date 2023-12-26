// 2. Implement a Date class with following member functions. Also overload remaining relational operators to compare two dates.
//    Also write a small program to demonstrate the use of Date class and overloaded relational operators.
// class Date {
// 	int day;
// 	int month;
// 	int year;
// public:
// 	Date();
// 	Date(int d, int m, int y);
// 	void Read();
// 	void Write();
// 	bool operator==(Date obj2);
// };
#include<iostream>
using namespace std;
class Date {
	int day;
	int month;
	int year;
public:
	Date(){};
	Date(int d, int m, int y):day(d),month(m),year(y){
        day = d;
        month = m;
        year = y;
    };
	void Read(){
        //cout<<"Enter day,month ands year="<<endl;
        cin>>day>>month>>year;

    };
	void Write()
    {
        cout<<day<<"/"<<month<<"/"<<year<<endl;
    };
	bool operator==(Date obj2){
        if(day==obj2.day && month==obj2.month && year==obj2.year){
            return true;
        }
        else
            return false;
    };

    bool operator<(const Date& obj2) {
        if (year < obj2.year)
            return true;
        else if (year == obj2.year && month < obj2.month)
            return true;
        else if (year == obj2.year && month == obj2.month && day < obj2.day)
            return true;
        else
            return false;
    }
};

int main()
{
    Date date1;
    Date date2;
    cout<<"Enter day,month and year of date1 ="<<endl;
    date1.Read();
    cout<<"Enter day,month and year of date2 ="<<endl;
    date2.Read();
    cout<<"date1 = ";
    date1.Write();
    cout<<"date2 = ";
    date2.Write();
    if(date1==date2){
        cout<<"date1 and date2 are same"<<endl;
    }
    else
        cout<<"date1 and date2 are not same"<<endl;
    Date date3(06,05,2002);
    cout<<"date3 = ";
    date3.Write();
    if(date3<date2)
        cout<<"date3 is earlier than date2"<<endl;
    else
        cout<<"date3 is later than date2"<<endl;

    


}