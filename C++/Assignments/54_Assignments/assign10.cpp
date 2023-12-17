//10. Write a program to find maximum of three numbers using conditional operators.

#include<iostream>
using namespace std;

int main(){
    int a,b,c;
    cout<<"Enter the number1 = "<<endl;
    cin>>a;
    cout<<"Enter the number2 = "<<endl;
    cin>>b;
    cout<<"Enter the number3 = "<<endl;
    cin>>c;
    cout<<"a = "<<a<<" "<<"b = "<<b<<" "<<"c = "<<c<<endl;

    if(a>=b && a>=c)    
        cout<<"a is maximum of three numbers"<<endl;
    else if(b>=c)    
        cout<<"b is maximum of three numbers"<<endl;  
    else 
        cout<<"c is maximum of three numbers"<<endl;  
}