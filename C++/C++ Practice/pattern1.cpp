#include<iostream>
using namespace std;
void pattern(int a);
int main(){
    int n;
    cout<<"Enter the number of lines = ";
    cin>>n;
    pattern(n);
}

void pattern(int n){
    for(int i=0;i<n;i++){
        for(int j=0;j<=i;j++){
            cout<<"*"<<" ";
        }
        cout<<"\n";
    }

}