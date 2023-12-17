// 23. Write a program which accepts two integers in main(). Pass these as arguments to function
// max(). In max(), find the maximum of these two numbers and using a return statement, return
// the address of the maximum number and print it in main().
#include<iostream>
using namespace std;
int* max(int *n1,int *n2){
    if(*n1 >= *n2)
        return n1;
    else 
        return n2;    
}
int main(){
    int n1,n2;
    cout<<"Enter two numbers = "<<endl;
    cin>>n1>>n2;
    int *m =max(&n1,&n2);
    cout<<"Maximum number is "<<*m;
}