#include<iostream>
using namespace std;
int factorial(int m);
int main(){
    int n;
    cout<<"Enter the number = ";
    cin>>n;
    int fact = factorial(n);
    cout<<"Factorial of "<<n<<" = "<<fact;
}

int factorial(int n){
    int f = 1;
    while(n>0){
        f = f * n;
        n--;
    }
    return f;
}
