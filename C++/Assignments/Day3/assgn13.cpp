//13. Given a positive integer N, print the digits in the number as words.
#include<iostream>
using namespace std;
int main(){
    int n;
    int r;
    int revn = 0;
    cout<<"Enter a number = ";
    cin>>n;
    cout<<n<<" in words is ";
    while(n>0){
        r = n%10;
        revn = (revn*10)+r;
        n=n/10;
    }
    
    while(revn>0){
        r = revn%10;
        revn = revn/10;
        
        switch(r){
            case 0:
                cout<<" Zero ";
                break;
            case 1:
                cout<<" One ";
                break;
            case 2:
                cout<<" Two ";
                break;
            case 3:
                cout<<" Three ";
                break;
            case 4:
                cout<<" Four ";
                break;
            case 5:
                cout<<" Five ";
                break;
            case 6:
                cout<<" Six ";
                break;
            case 7:
                cout<<" Seven ";
                break;
            case 8:
                cout<<" Eight ";
                break;
            case 9:
                cout<<" Nine ";
                break;
        }
    }
    return 0;
}