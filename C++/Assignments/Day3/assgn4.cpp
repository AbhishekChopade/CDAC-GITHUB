//4. Find prime numbers between two positive integers N and M, including N and M.
#include<iostream>
using namespace std;
int main(){
    int n,m;
    cout<<"Enter the 1st number = ";
    cin>>n;
    cout<<"Enter the 2nd number = ";
    cin>>m;
    bool flag;
    while(n<=m){
        flag = true;
        for(int i=1;i<=n/2;i++){
            if(i==1)
                continue;
            if(n%i==0){
                flag = false;
                break;
            }
        }
        if(flag==true)
            cout<<n<<" ";
        n++;
    }
} 