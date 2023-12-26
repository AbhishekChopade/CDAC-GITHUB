//Finish the implementation of BigInt classby overloading remaining relational operators to compare two BigInt Class .
//Also write a small program to demonstrate the use pf BigInt clASS AND overload relational operators 
#include<iostream>
using namespace std;


// bool operator==(int n,BigInt obj){
//         if(n==obj.num)
//             return true;
//         return false;    
// }
class BigInt{

    private:
        int num;
    public:
        BigInt();
        BigInt(int n):num(n){
            num = n;
        }
        //relational operators
        bool operator == (BigInt &obj){
            if(this->num == obj.num){
                return true;
            }
            else    
                return false;
        }
        bool operator==(int n){
            if(num==n)
                return true;
            return false;    
        }
        bool operator > (BigInt &obj){
            if(this->num > obj.num){
                return true;
            }
            else    
                return false;
        }
        // bool operator ==(int n,const BigInt& obj){
        //     return (obj==n);
        // }
        // friend bool operator==(int n ,BigInt& obj);

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
   // int i = 10;
    if(obj1==obj2){
        cout<<"obj1 and obj2 both are same"<<endl;
    }
    else 
        if(obj1>obj2)
            cout<<"obj1 is greater"<<endl;
        else    
            cout<<"obj2 is greater"<<endl;
    

    if(obj1==5)
        cout<<"obj1 is equal to 5"<<endl;
    else 
        cout<<"obj1 is not equal to 5"<<endl; 

    // if(10==obj1)
    //      cout<<"i is equal to obj1"<<endl;
    // else 
    //     cout<<"i is not equal to obj1"<<endl; 
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
