// 4. Write a program to swap two variables using a third variable and without using third variable.

#include<iostream>
using namespace std;

int main(){
    int a,b;
    int temp;
    cout<<"Enter the numbers a and b: ";
    cin>>a>>b;
    cout<<"Before swap "<<endl;
    cout<<"a = "<<a<<endl;
    cout<<"b = "<<b<<endl;
    //without using third variable
    //cout<<"without using third variable"<<endl;
    // a = a + b;
    // b = a - b;
    // a = a - b;
    //with using third variable
    cout<<"with using third variable"<<endl;
    temp = a;
    a = b;      
    b = temp;
    cout<<"After swap "<<endl;
    cout<<"a = "<<a<<endl;
    cout<<"b = "<<b<<endl;

}

//with using third variable
// int main(){
//     int a,b;
//     int temp;
//     cout<<"Enter the numbers a and b: ";
//     cin>>a>>b;
//     cout<<"Before swap "<<endl;
//     cout<<"a = "<<a<<endl;
//     cout<<"b = "<<b<<endl;
//     temp = a;
//     a = b;
//     b = temp;
//     cout<<"After swap "<<endl;
//     cout<<"a = "<<a<<endl;
//     cout<<"b = "<<b<<endl;

// }