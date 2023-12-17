///find the sum of all array elemnts
#include<iostream>
using namespace std;
int getValidCount(int MAX_NUM);
void readElements(int arr[], int n);
int findSum(int arr[],int n);
    
int main(){
    const int MAX_NUM = 100;
    int nums[MAX_NUM];
    int n = getValidCount(MAX_NUM);
    readElements(nums, n);
    int sum = findSum(nums,n);
    cout<<"Sum = "<<sum;
    return 0;
}

int getValidCount(int mn){
    do{
        cout<<"Enter the number (<=100) = ";
        cin>>mn;

    }while(mn>100 || mn<=0);
    return mn;
}

void readElements(int nums[],int n){
    for(int i=0;i<n;i++){
        cout<<"Enter the element = ";
        cin>>nums[i];
    }
}

int findSum(int nums[],int n){
    int s = 0;
    for(int i=0;i<n;i++){
        s+=nums[i];
    }
    return s;

}


