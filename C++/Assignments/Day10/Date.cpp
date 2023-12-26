// 2. For the Date class overload following operators.
//    Binary operator + to work with
//    - one Date operand and one int
//    Binary operator - to work with
//    - both operands of type Date
//    - one Date operand and one int
//    Unary operators ++ and -- in both pre and post form.
//    Also write a small program to demonstrate the use of Date class and overloaded relational operators.

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
    void operator+(int i)
    {
        this->day = this->day + i;
    }
    void operator-(int i)
    {
        this->day = this->day - i;
    }
    void operator-(Date d2)
    {
        this->day = this->day - d2.day;
        this->month = this->month - d2.month;
        this->year = this->year - d2.year;
    }

    //unary operators '++' and '--'
    Date operator++(){
        this->day++;
        return *this;
    }
    Date operator++(int){
        Date result(*this);
        ++day;
        return result;
    }
    Date operator--(){
        this->day --;
        return *this;
    }
    Date operator--(int){
        Date result(*this);
        --day;
        return result;
    }
    

};

int main()
{
    Date date1(06,04,2022);
    Date date2(17,04,2022);
    Date date3;
    // cout<<"Enter day,month and year of date1 ="<<endl;
    // date1.Read();
    // cout<<"Enter day,month and year of date2 ="<<endl;
    // date2.Read();
    cout<<"date1 = ";
    date1.Write();
    cout<<"date2 = ";
    date2.Write();
    date1 + 5;
    cout<<"date1 + 5 = ";
    date1.Write();
    date1 - 5;
    cout<<"date1 - 5 = ";
    date1.Write();
    date1 - date2;
    cout<<"date1 - date2 = ";
    date1.Write();
    date3 = ++date2;
    cout<<"date3 = ++date2 : ";
    date3.Write();
    date3 = date2++;
    cout<<"date3 = date2++ : ";
    date3.Write();
    date3 = --date2;
    cout<<"date3 = --date2 : ";
    date3.Write();
    date3 = date2--;
    cout<<"date3 = date2-- :";
    date3.Write();


    

}


