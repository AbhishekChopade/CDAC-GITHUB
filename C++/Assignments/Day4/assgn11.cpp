//11. Given a positive integer N, check if it is an armstrong number or not.

#include<iostream>
using namespace std;
int main(){
    int n;
    int d;
    int sum = 0;
    int r;
    do{
	    cout<<"Enter a number = ";
	    cin>>n;
	    if(n<=0){
	    	cout<<"Number is invalid it less than 0!!!!"<<endl;
	    	cout<<"Please re-enter the number which is greater than 0 = ";
	    	cin>>n;
	    	}
    }while(n<=0);
    cout<<"Enter number of digits = ";
    cin>>d;
    int org = n;
    
    while(n>0){
        r = n % 10;
        sum = sum + (r*r*r);
        n=n/10;
    }
    
    if(org==sum)
        cout<<org<<" is an armstrong number";
    else
        cout<<org<<" is not an armstrong number";

    return 0;
}