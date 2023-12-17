//3.Find sum of all numbers between two positive integers N and M, including N and M.
#include<iostream>
using namespace std;
int main(){
    int n;
    int m;

    do{
	    cout<<"Enter the two numbers = ";
	    cin>>n>>m;
	    if(n<=0){
	    	cout<<"First number is invalid it less than 0!!!!"<<endl;
	    	cout<<"Please re-enter the 1st number which is greater than 0 = ";
	    	cin>>n;
	    }
        if(m<=0){
        cout<<"Second number is invalid it less than 0!!!!"<<endl;
        cout<<"Please re-enter the 2nd number which is greater than 0 = ";
        cin>>m;
        }

    }while(n<=0 || m<=0);

    int sum = 0;
    for(int i=n;i<=m;i++){
        sum+=i;
       
    }
    cout<<"Sum = "<<sum;

    return 0;
}