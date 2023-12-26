//5. Find the first digit in a positive integer.
#include<iostream>
using namespace std;
int main(){
    int n;
    do{
	    cout<<"Enter a number = ";
	    cin>>n;
	    if(n<=0){
	    	cout<<"Number is invalid it less than 0!!!!"<<endl;
	    	cout<<"Please re-enter the number = ";
	    	cin>>n;
	    	}
    }while(n<=0);
    
    while(n>=10){
        n = n/10;
    }
    
    cout<<"First digit = "<<n;

    return 0;
}
