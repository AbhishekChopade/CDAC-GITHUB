// 41. Write a class Array which will store integer elements in dynamically allocated space.

// class Array
// {
// int size;
// int *arr;
// }
// Provide below functions in Array class -
// 1. Default constructor - Take 5 as default size. Initialize the array elements to 0
// 2. Parameterized constructor - Takes size as parameter. Initialize the array elements to 0.
// 3. Copy constructor - Performs deep copy of Array object.
// 4. Destructor - Deletes memory which is allocated dynamically.

#include<iostream>
using namespace std;

class Array{
    int size;
    int *arr;
    public:
        Array();
        Array(int);
        void Display();
        Array(Array &);
        //~Array();
};
Array::Array(){
    size = 5;
    arr = new int[size];
    for(int i;i<size;i++){
        arr[i]=0;
    }
}
Array::Array(int s){
    size = s;
    arr = new int[size];
    for(int i;i<size;i++){
        arr[i]=0;
    }
}

Array::Array(Array &a){
    size = a.size;
    arr = new int[size];
    for(int i;i<size;i++){
        arr[i] = a.arr[i];
    }
}

void Array::Display(){
    for(int i=0;i<size;i++){
        cout<<arr[i]<<" ";
    }
    cout<<endl;
}
int main(){
    Array a1;
    cout<<"Elemnts of array a1 = ";
    a1.Display();
    Array a2(7);
    cout<<"Elemnts of array a2 = ";
    a2.Display();
    Array a3(a1);
    cout<<"Elemnts of array a3 = ";
    a3.Display();
    return 0;
}