// 24. Accept five integers in an array and use separate functions to:
// a. Find maximum and minimum of the integers. Do not sort the array.
// b. Multiply each element of the array by 5 and store it in another array and display it.
#include<iostream>
using namespace std;
void Accept(int arr[],int size){
    for(int i=0;i<size;i++){
        cout<<"Enter an array element at position "<<i<<" = "<<endl;
        cin>>arr[i];
    }
}
int maximum(int arr[],int s){
    int max = arr[0];
    for(int i=0;i<s;i++){
        if(arr[i]>max)
        {
            max = arr[i];
        }
    }
    return max;
}
int minimum(int arr[],int s){
    int min = arr[0];
    for(int i=0;i<s;i++){
        if(arr[i]<min)
        {
            min = arr[i];
        }
    }
    return min;
}
void multiply(int arr[],int arr2[], int s){
    int m = 5;
    for(int i=0;i<s;i++){
        arr2[i]= m*arr[i];
    }
}
int main(){
    int size=5;
    int arr[size];
    int arr2[size];
    Accept(arr,size);
    int maxNum = maximum(arr,size);
    int minNum = minimum(arr,size);
    multiply(arr,arr2,size);
    cout<<"arr = ";
    for(int i=0;i<size;i++){
        cout<<arr[i]<<" ";
    }
    cout<<endl;
    cout<<"Max = "<<maxNum<<endl;
    cout<<"Min = "<<minNum<<endl;
    cout<<"arr2 = ";
    for(int i=0;i<size;i++){
        cout<<arr2[i]<<" ";
    }
    
    return 0;   
}