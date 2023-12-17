#include<iostream>
using namespace std;
void pattern2(int a);
int main(){
    int n;
    cout<<"Enter the number of lines = ";
    cin>>n;
    pattern2(n);
}

void pattern2(int n){
    for(int i=0;i<n;i++){
        int k = 0;
        int j = n-i;
        while(j>0){
            cout<<"  ";
            j--;
        }
        while(k<=i){
            cout<<"*"<<" ";
            k++;
        }
        cout<<"\n";
    }

}