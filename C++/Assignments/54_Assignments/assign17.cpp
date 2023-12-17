// 17. Write a program to generate following output.

// 1 2 3 4 5 4 3 2 1
// 1 2 3 4   4 3 2 1
// 1 2 3       3 2 1
// 1 2           2 1
// 1               1
#include<iostream>
using namespace std;

int main(){
    int n;
    cout<<"Enter the number = "<<endl;
    cin>>n;

    for(int i=n;i>=1;i--){
        for(int j=1;j<=i;j++){
                cout<<j<<" ";
                
        }
       //for spaces
        for(int k=1;k<=2*(n-i);k++){
               cout<<"  ";
        }
        
        cout<<"\b\b";
        for(int j=i;j>=1;j--){
            
                cout<<j<<" ";
        }
        cout<<endl;

    }
    
    return 0;

}
