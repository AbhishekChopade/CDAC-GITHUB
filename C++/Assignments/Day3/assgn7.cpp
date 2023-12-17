//6.Find the sum of all digit of a positive integer.
#include<iostream>
using namespace std;
int main(){
    int n;
    int r;
    int sum = 0;
    cout<<"Enter a number = ";
    cin>>n;
    if(n<0){
        while(n<0){
            r = n%10;
            r = r *(-1);
            sum = sum + r;
            n = n/10;
        }
        cout<<"Sum of all digits of negative number = "<<sum;
    }
    else{
        while(n>0){
            r = n%10;
            sum = sum + r;
            n = n/10;
        }
        cout<<"Sum of digits of positive number = "<<sum;
    }

    return 0;
}