//12. Find the count of a digit in a given positive integer.

#include<iostream>
using namespace std;
int main(){
    int num,rem,dig;
    int count = 0;
    do{
	    cout<<"Enter a number = ";
	    cin>>num;
	    if(num<=0){
	    	cout<<"Number is invalid it less than 0!!!!"<<endl;
	    	cout<<"Please re-enter the number which is greater than 0 = ";
	    	cin>>num;
	    	}
    }while(num<=0);
    cout<<"Enter a digit = ";
    cin>>dig;
    int t = num;
    
    while(t>0){
        rem = t%10;
        t=t/10;
        if(rem==dig)
            count++;
    }
    cout<<"Count of digit "<<dig<<" in "<<num<<" is "<<count;

    return 0;
}