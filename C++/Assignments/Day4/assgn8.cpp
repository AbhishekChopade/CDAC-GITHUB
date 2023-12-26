//8. Find the product of all digit of a positive integer.
#include<iostream>
using namespace std;
int main(){
    int n;
    int r;
    int prod = 1;
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
        prod = prod * r;
        n = n/10;
    }
    cout<<"Product of digits = "<<prod;

    return 0;
}