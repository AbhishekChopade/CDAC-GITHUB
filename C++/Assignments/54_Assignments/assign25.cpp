// 25. Write a program to delete an element from a user entered array. Accept position of element to
// be deleted from user.
#include<iostream>
using namespace std;
void Accept(int arr[],int size){
    for(int i=0;i<size;i++){
        cout<<"Enter an array element at position "<<i<<" = "<<endl;
        cin>>arr[i];
    }
}

void multiply(int arr[],int arr2[], int s){
    int m = 5;
    for(int i=0;i<s;i++){
        arr2[i]= m*arr[i];
    }
}
int main(){
    int size=5;
    int arr[size];//={10,29,60,70,34};
    int p;
    for(int i=0;i<size;i++){
        cout<<"Enter an array element at position "<<i<<" = "<<endl;
        cin>>arr[i];
    }

    cout<<"Enter the position at which element to be deleted = "<<endl;
    cin>>p;
    if(p>size && p<=0)
        cout<<"Invalid Position"<<endl;
    for(int i=p-1;i<size-1;i++){
        arr[i]=arr[i+1];
    }
    size--;

    cout<<"Array arr after delete element from postion "<<p<<" = ";
    for(int i=0;i<size;i++){
        cout<<arr[i]<<" ";
    }
    
    return 0;   
}