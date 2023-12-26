//6.Find the sum of all digit of a positive integer.
#include<iostream>
using namespace std;
int main(){
    int n;
    int r;
    int sum = 0;
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
        sum = sum + r;
        n = n/10;
    }
    cout<<"Sum of digits = "<<sum;

    return 0;

}