#include<iostream>
using namespace std;

class MyClass {
public:
    void NonConstFunction() {
        // This function can modify the object
    }

    void ConstFunction() const {
        MyClass obj;
        // This function cannot modify the object

        //NonConstFunction();                    //here we cannot call non constant fun in constant function
        obj.NonConstFunction();                  // here we can call it by non constant object 

     // Error, cannot call a non-const function in a const member function

        // You can call other const member functions
        AnotherConstFunction();                 // but we can call another constant function in constant function
    }

    void AnotherConstFunction() const {
        // This is a const member function
        // You can call other const member functions
    }
};

int main()
{
    const MyClass obj1;
    obj1.ConstFunction();
    //obj1.NonConstFunction();     //if obj1 is constant you cannot call non constant function, you can only call constant functions
    obj1.AnotherConstFunction();
}