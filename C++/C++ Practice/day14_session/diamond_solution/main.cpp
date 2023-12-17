#include <iostream>

#include "classes.h"

int main() {
    //sir's program
    // std::cout << "\nCreate Derived1 object\n";
    // Derived1 obj1;
    // obj1.i = 10;
    // std::cout << "i = " << obj1.i << "\n";

    // std::cout << "\nCreate Derived object\n";
    // Derived objD;
    // std::cout << "i = " << objD.i << "\n";
    // objD.i = 100;
    // std::cout << "i = " << objD.i << "\n";

    // std::cout << "Size of Base = " << sizeof(Base) << "\n";
    // std::cout << "Size of Derived1 = " << sizeof(Derived1) << "\n";
    // std::cout << "Size of Derived2 = " << sizeof(Derived2) << "\n";
    // std::cout << "Size of Derived = " << sizeof(Derived) << "\n";

    // return 0;


    //////////////////////////////////////////
    //my program
    std::cout << "\nCreate Derived1 object\n";
    Derived1 obj1;
    obj1.i = 10;
    std::cout << "i = " << obj1.i << "\n";


    std::cout << "\nCreate Derived object\n";
    Derived objD;
    objD.i = 500;
    std::cout << "Derived i = " << objD.i << "\n";
    objD.Derived1::i=200;
    std::cout << "Derived1 i = " << objD.Derived1::i << "\n";
    objD.Derived2::i=300;
    std::cout << "Derived2 i = " << objD.Derived2::i << "\n";


    std::cout << "Derived1 i = " << objD.Derived1::i << "\n";
    std::cout << "Derived2 i = " << objD.Derived2::i << "\n";
    std::cout << "Derived i = " << objD.i << "\n";
    return 0;
}