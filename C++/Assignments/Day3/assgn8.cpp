//8. Find the product of all digit of a positive integer.
#include<iostream>
using namespace std;
int main(){
    int n;
    int r;
    int prod = 1;
    cout<<"Enter a number = ";
    cin>>n;
    while(n>0){
        r = n%10;
        prod = prod * r;
        n = n/10;
    }
    cout<<"Product of digits = "<<prod;

    return 0;
}