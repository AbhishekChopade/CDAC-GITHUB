//3.Find sum of all numbers between two positive integers N and M, including N and M.
#include<iostream>
using namespace std;
int main(){
    int n;
    int m;
    cout<<"Enter the 1st number = ";
    cin>>n;
    cout<<"Enter the 2nd number = ";
    cin>>m;
    int sum = 0;
    for(int i=n;i<=m;i++){
        sum+=i;
       
    }
    cout<<"Sum = "<<sum;

    return 0;
}