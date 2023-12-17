////1. factors of given number
#include<iostream>
using namespace std;
int main(){
    int n;
    do{
	    std::cout<<"Enter a number = ";
	    std::cin>>n;
	    if(n<=0){
	    	cout<<"Number is invalid it less than 0";
	    	cout<<"Please re-enter the number = ";
	    	cin>>n;
	    }
    }while(n<=0);
    
    for(int i=1;i<n;i++){
        if(n%i==0){
            std::cout<<i<<" ";
        }
    }

    return 0;
}
