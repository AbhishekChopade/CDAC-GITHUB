#include<iostream>
using namespace std;

class Array{
    int* data;
    const int size;
    void copyArray(int *dest, int *src, int size) {
        for (int i = 0; i < size; ++i) {
            dest[i] = src[i];
        }
    }

    public:
    Array(int n):size(n){
        //data = (int *)malloc(sizeof(int)*n);
        cout<<"Allocate memory for array of size " << size << "\n";
        //data = new int[size];
        data = (int *)malloc(sizeof(int)*n);
    }

    int& operator [](int i){
        static int temp;
        if((i<0)||(i>=size)){
            return temp;
        }
        return data[i];
    }
    Array(Array& obj) : size(obj.size) {
        std::cout << "Array copy constructor of size " << size << "\n";
        data = new int[size];
        copyArray(data, obj.data, size);
    }

    ~Array(){
        std::cout << "Free array memory of size " << size << "\n";
        //delete data;
        free(data);
    }
};

int main(){
    Array arr1(5);
    //arr1.f1(arr1);
    Array arr2(arr1);
    arr1[0]=5;       //arr1.operator[](0)
    arr2[0]=10;
    cout<< "1st element of arr1 = "<<arr1[0]<<endl;
    cout<< "1st element of arr2 = "<<arr2[0]<<endl;
}