// 1. In BigInt class overload following operators:
//    Binary operators + - * / to work with
//    - both operands of type BigInt
//    - one BigInt operand and one int
//    Unary operators ++ and -- in both pre and post form.
//    Also write a small program to demonstrate the use of BigInt class and overloaded operators.


#include<iostream>
using namespace std;

class BigInt{

    private:
        int num;
    public:
        BigInt();
        BigInt(int n):num(n){
            num = n;
        }
       

        //Arithmetic operators
        BigInt operator + (BigInt obj){
            // BigInt obj3;
            // obj3.num = num + obj.num;
            // return obj3;
            return BigInt(num+obj.num);
        }
        BigInt operator - (BigInt obj){
            return BigInt(num-obj.num);
        }
        BigInt operator * (BigInt obj){
            return BigInt(num*obj.num);
        }
        BigInt operator / (BigInt obj){
            return BigInt(num/obj.num);
        }
        BigInt operator+(int n){
            return BigInt(num+n);    
        }
        BigInt operator-(int n){
            return BigInt(num-n);    
        }
        BigInt operator*(int n){
            return BigInt(num*n);    
        }
        BigInt operator/(int n){
            return BigInt(num/n);    
        }

        //increment '++' and decrement '--' operators
        BigInt operator ++(){
            //BigInt temp;
            ++num;
            //temp.num = num;
            return *this;
            //return BigInt(num);
        }
        BigInt operator ++(int){
            BigInt result(*this); 
            ++num;
            return result;
        }
        BigInt operator --(){
            --num;
            return *this;
        }
        BigInt operator --(int){
            BigInt result(*this); 
            --num;
            return result;
        }

        int getValue(){
            return num;
        }
};

int main(){
    BigInt obj1(20); //parameterized constructor gets called
    BigInt obj2 = 20; //parameterized constructor gets called  
   
    BigInt obj3 = obj1 + obj2;
    cout<<"obj1 = "<<obj1.getValue()<<endl;
    cout<<"obj2 = "<<obj2.getValue()<<endl;
    cout<<"obj3 using '+' = "<<obj3.getValue()<<endl;
    obj3 = obj1 - obj2;
    cout<<"obj3 using '-' = "<<obj3.getValue()<<endl;
    obj3 = obj1 * obj2;
    cout<<"obj3 using '*' = "<<obj3.getValue()<<endl;
    obj3 = obj1 / obj2;
    cout<<"obj3 using '/' = "<<obj3.getValue()<<endl;

   
    obj3 = obj1 + 5;    //obj1.num=20
    cout<<"obj3 using '+' with int = "<<obj3.getValue()<<endl;
    obj3 = obj1 - 5;   
    cout<<"obj3 using '-' with int = "<<obj3.getValue()<<endl;
    obj3 = obj1 * 5;   
    cout<<"obj3 using '*' with int = "<<obj3.getValue()<<endl;
    obj3 = obj1 / 5;    
    cout<<"obj3 using '/' with int = "<<obj3.getValue()<<endl;

    obj3 = ++obj1;    //obj1=20, after pre increment obj1=21 and obj3=21
    cout<<"obj3 using pre-increment '++' = "<<obj3.getValue()<<endl;
    obj3 = obj1++;    //obj1=21, after post increment obj1=22 and obj3=21
    cout<<"obj3 using post-increment '++' = "<<obj3.getValue()<<endl;
    obj3 = --obj1;    //obj1=22, after pre decrement obj1=21 and obj3=21
    cout<<"obj3 using pre-decrement '--' = "<<obj3.getValue()<<endl;
    obj3 = obj1--;   //obj1=21, after post increment obj1=20 and obj3=21 
    cout<<"obj3 using post-decrement '--' = "<<obj3.getValue()<<endl;
    return 0;
}
