#include<iostream>
using namespace std;
int add(int a, int b){
    return a+b;
}

float add(int a, float b){
    return a+b;
}

int add(int a, int b, int c){
    return a+b;
}

float add(float a, float b){
    return a+b;
}
int main(){
    int a1 = add(5,3);
    cout<<"a1 = "<<a1<<endl;

    float a2 = add(2.5f,7.6f);
    cout<<"a2 = "<<a2<<endl; 

    float a3 = add(4,8.7f);
    cout<<"a3 = "<<a3<<endl; 

    int a4 = add(14,6,8);
    cout<<"a4 = "<<a4<<endl; 
}

