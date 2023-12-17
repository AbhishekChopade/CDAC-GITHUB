#include<iostream>
using namespace std;
void swap(int a, int b);
int main(){
    int X,Y;
    cout<<"Enter the two numbers : ";
    cin>>X>>Y;
    cout<<"X = "<<X<<" Y = "<<Y<<endl;
    swap(X,Y);
}

void swap(int X, int Y){
    int temp;
    temp = X;
    X = Y;
    Y = temp;
    cout<<"X = "<<X<<" Y = "<<Y<<endl;
}