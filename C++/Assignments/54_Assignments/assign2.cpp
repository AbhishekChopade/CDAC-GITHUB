
// 2. Write a program to accept marks of five subjects from the user and calculate their average. Use
// implicit and explicit type conversion.

#include<iostream>
using namespace std;

int main(){
    int s1,s2,s3,s4,s5;
    int sum;
    float avg,avg2;
    cout<<"Enter the marks of  5 subjects s1,s2,s3,s4,s5: ";
    cin>>s1>>s2>>s3>>s4>>s5;
    sum = s1+s2+s3+s4+s5;
    avg = (sum/5.0);     //implicit
    avg2 = float(sum)/5;  //explicit
    cout<<avg<<endl;
    cout<<avg2;

}