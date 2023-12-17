// Draw a rectangle for user defined dimensions of length and breadth. 

#include<iostream>
using namespace std;

int main(){
    int l, b;
    cout<<"Enter length and breadth of a rectangle = "<<endl;
    cin>>l>>b;

    for(int i=0;i<l;i++){
        for(int j=0;j<b;j++){
            if(i==0||j==0||i==(l-1)||j==(b-1))  
                cout<<"* ";
            else 
                cout<<"  ";
        }
        cout<<endl;
    }
}


