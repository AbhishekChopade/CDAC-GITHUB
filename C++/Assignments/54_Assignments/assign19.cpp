// 19. Write a function ‘Fibonacci()’ to generate the terms of the fibonacci series. The number of terms
// should be entered by the user in main(). The series should be printed in the function. The terms
// of the Fibonacci series are 0 1 1 2 3 5 8 13 21 . . .

#include<iostream>
using namespace std;
int Fibonacci(int count){
    int n1 = 0;
    int n2 =1;
    int n3;
    cout<<n1<<" "<<n2<<" ";
    while(count>0){
        n3 = n1 + n2;
        n1 = n2;
        n2 = n3;
        cout<<n3<<" ";
        count--;
    }

}
int main(){
    int count;
    cout<<"Enter the count = "<<endl;
    cin>>count;
    int fibSer = Fibonacci(count);

}