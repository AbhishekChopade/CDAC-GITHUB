#include <iostream>

class Base {
    int b;
public:
    Base(){
        std::cout << "Base default constructor\n";
    }
    Base(int x) : b(x) {
        std::cout << "Base parametirzed constructor\n";
        b=x;
    }
    ~Base() {
        std::cout << "Base destructor\n";
    }
    void setB(int b) {
        this->b = b;
    }
    int getB() {
        return b;
    }
};

class Derived : public Base {
    int d;
public:
    Derived(){
        std::cout << "Derived default constructor\n";
    
    }
    Derived(int x) : d(x), Base(x / 2) {
        std::cout << "Derived parametized constructor\n";
        d=x;
    }
    // Derived(int x,int y) : d(x), Base(y) {
    //     std::cout << "Derived parametized constructor\n";
    //     d=x;
    // }   


    ~Derived() {
        std::cout << "Derived destructor\n";
    }
    void setD(int d) {
        this->d = d;
    }
    int getD() {
        return d;
    }
};

int main() {
    //Derived objD;
    Derived objD(10);
    // Derived objD(10,20);
    std::cout << "getB for Derived = " << objD.getB() << "\n";
    std::cout << "getD for Derived = " << objD.getD() << "\n";
    objD.setB(10);
    objD.setD(5);

    std::cout << "Size of Base = " << sizeof(Base) << "\n";
    std::cout << "Size of Derived = " << sizeof(Derived) << "\n";
    std::cout << "getB for Derived = " << objD.getB() << "\n";

    return 0;
}
