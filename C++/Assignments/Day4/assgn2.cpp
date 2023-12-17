//2. Given a positive integer N, find its reverse.
#include<iostream>
using namespace std;
int main(){
    int n;
    int r;
    int revn = 0;
    do{
	    cout<<"Enter a number = ";
	    cin>>n;
	    if(n<=0){
	    	cout<<"Number is invalid it less than 0!!!!"<<endl;
	    	cout<<"Please re-enter the number which is greater than 0 = ";
	    	cin>>n;
	    	}
    }while(n<=0);

    while(n>0){
        r = n%10;
        revn = (revn*10)+r;
        n=n/10;
    }
    cout<<"Reversed number = "<<revn;

    return 0;
}