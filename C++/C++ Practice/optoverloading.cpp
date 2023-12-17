#include<iostream>
using namespace std;

class Add{
    int n1;
   // int n2;

    public:
    void print(){
        cout<<n1<<" "<<endl;
    }

    Add(int n):n1(n){
        n1=n;
    }
    int operator+(Add a2){
        return n1+a2.n1;
    }

};

int main(){
    Add a1(10);
    Add a2(20);
    int a3;
    a3 = a1+a2;
    cout<<a3;
    // Add a3 = a1+a2;
    // a3.print();

}