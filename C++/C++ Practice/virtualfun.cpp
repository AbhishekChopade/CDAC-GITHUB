#include<iostream>
using namespace std;

class A{
    public:
    virtual void func(){
        cout<<"Base Class A"<<endl;
    }
};

class B : public A
{
    public:
    void func(){
        cout<<"Derived Class B"<<endl;
    }
};

int main(){
    A *a;
    B b;
    a = &b;
    a->func();

}
