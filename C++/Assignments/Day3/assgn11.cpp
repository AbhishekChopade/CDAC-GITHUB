//11. Given a positive integer N, check if it is an armstrong number or not.

#include<iostream>
using namespace std;
int main(){
    int n;
    int d;
    int sum = 0;
    int r;
    cout<<"Enter a number = ";
    cin>>n;
    cout<<"Enter number of digits = ";
    cin>>d;
    int org = n;
    
    while(n>0){
        r = n % 10;
        sum = sum + (r*r*r);
        n=n/10;
    }
    
    if(org==sum)
        cout<<org<<" is a armstrong number";
    else
        cout<<org<<" is not a armstrong number";

    return 0;
}