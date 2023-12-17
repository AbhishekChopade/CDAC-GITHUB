//Finish the implementation of BigInt classby overloading remaining relational operators to compare two BigInt Class .
//Also write a small program to demonstrate the use pf BigInt clASS AND overload relational operators 
#include<iostream>
using namespace std;

class BigInt{
  int num;
  public:
    BigInt();
    BigInt(int n):num(n){
        num = n;
    }

    bool operator == (BigInt obj2){
        if(this->num == obj2.num){
            return true;
        }
        else    
            return false;
    }
    bool operator > (BigInt obj2){
        if(this->num > obj2.num){
            return true;
        }
        else    
            return false;
    }

};

int main(){
    BigInt obj1(20); //parameterized constructor gets called
    BigInt obj2 = 20; //parameterized constructor gets called  
    if(obj1==obj2){
        cout<<"obj1 and obj2 both are same";
    }
    else 
        if(obj1>obj2)
            cout<<"obj1 is greater";
        else    
            cout<<"obj2 is greater";
  
    return 0;
}
