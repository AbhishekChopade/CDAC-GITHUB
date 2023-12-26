// 7. Write a program to find leap year by using:
// a. if-else and logical operators (&amp;&amp; and ||)
// b. Conditional Operators (? :)
// (A leap year is divisible by 4 and is not divisible by 100 but it could be divisible by 400)

#include<iostream>
using namespace std;

int main()
{
    int year;
    cout<<"Enter the year=";
    cin>>year;

    if((year%4==0 &&year % 100 !=0) || year%400==0)
        cout<<year<<" is a leap year";
    else
        cout<<year<<" is not a leap year";

    // if(year % 400==0)
    // {
    //     cout<<"Leap Year";
    // }

    // else
    //      if(year % 100==0)
    // {
    //     cout<<"Not a Leap year";
    // } 

    // else
    //      if( year % 4==0)
    // {
    //     cout<<"Leap year";
    // }
    // else
    // {
    //     cout<<"Not a Leap year";
    // }
}