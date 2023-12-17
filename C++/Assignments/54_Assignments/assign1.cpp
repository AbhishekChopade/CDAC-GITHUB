// 1. Write a program to print “Welcome to C++” using escape sequences: \n, \t, \r, \. Observe the
// difference in the output.
#include<iostream>
using namespace std;

int main()
{  
    //cout<<"Welcome"<<"\n"<<"to"<<"\t"<<"the"<<"\r"<<"C++"<<"\.";
    cout<<"Welcome to C++"<<"\n";
    cout<<"Welcome to C++"<<"\t";
    cout<<"Welcome to C++"<<"\r";
    cout<<"Welcome to C++"<<"\.";
}