#include <iostream>

class X {
    int val;
public:
    X() : val(0) {
        std::cout << "Default constructor\n";
    }
    ~X() {
        std::cout << "Destructor\n";
    }
    X(X& obj) {
        std::cout << "Copy Constructor\n";
    }
    int getVal() const {
        return val;
    }
    void setVal(int val) {
        this->val = val;
    }
};

void passByValue(X obj) {                //here we pass obj by value , so copy constructor gets called to create copy of obj.
    obj.setVal(100);
    std::cout << "In function object val is = " << obj.getVal() << "\n";   //obj of fun passByValue destoyed here cause of scope
}

void passByRef(X& obj) {
    obj.setVal(200);
    std::cout << "In function object val is = " << obj.getVal() << "\n";
}

void passByConstRef(const X& obj) {
    //obj.setVal(200);           //this gives error because obj is constant , we cannot change it
    std::cout << "In function object val is = " << obj.getVal() << "\n";
}

int main() {
    X obj;

    std::cout << "\nCalling passByValue\n";
    passByValue(obj);              //here we pass obj by value , so copy constructor gets called to create copy of obj.
    std::cout << "Object val is = " << obj.getVal() << "\n"; //here obj is of main class 
    // obj.setVal(400);
    // std::cout << "Object val is = " << obj.getVal() << "\n";


    std::cout << "\nCalling passByRef\n";
    passByRef(obj);              //here copy constructor is not called because of obj is copied into ref
    std::cout << "Object val is = " << obj.getVal() << "\n";

    std::cout << "\nCalling passByConstRef\n";
    passByConstRef(obj);
    std::cout << "Object val is = " << obj.getVal() << "\n";

    const X constObj;
    constObj.getVal();

    return 0;
}
