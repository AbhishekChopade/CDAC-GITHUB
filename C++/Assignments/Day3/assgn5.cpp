//5. Find the first digit in a positive integer.
#include<iostream>
using namespace std;
int main(){
    int n;
    int fd;
    cout<<"Enter the number = ";
    cin>>n;
    
    fd = n/10;
    cout<<"First digit = "<<fd;

    return 0;
}