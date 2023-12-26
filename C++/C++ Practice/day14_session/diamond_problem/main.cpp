#include <iostream>

#include "classes.h"

int main() {
    // std::cout << "\nCreate Derived1 object\n";
    // Derived1 obj1;
    // obj1.i = 10;
    // std::cout << "i = " << obj1.i << "\n";

    // std::cout << "\nCreate Derived object\n";
    // Derived objD;
    // //objD.i = 100; // show error due to diamond problem
    // objD.Derived1::i=100;
    // std::cout << "i = " << objD.Derived1::i << "\n";
    // std::cout << "i = " << objD.Derived2::i << "\n";


     //////////////////////////////////////////
    //my program
    std::cout << "\nCreate Derived1 object\n";
    Derived1 obj1;
    obj1.i = 10;
    std::cout << "i = " << obj1.i << "\n";


    std::cout << "\nCreate Derived object\n";
    Derived objD;
    // objD.i = 500;                             // show error due to diamond problem or ambiguity
    // std::cout << "Derived i = " << objD.i << "\n"; // show error due to diamond problem or ambiguity
    objD.Derived1::i=200;
    std::cout << "Derived1 i = " << objD.Derived1::i << "\n";
    objD.Derived2::i=300;
    std::cout << "Derived2 i = " << objD.Derived2::i << "\n";
    
    
    std::cout << "Derived1 i = " << objD.Derived1::i << "\n";  
    std::cout << "Derived2 i = " << objD.Derived2::i << "\n";
    //std::cout << "Derived i = " << objD.i << "\n";              // show error due to diamond problem or ambiguity

    return 0;
}