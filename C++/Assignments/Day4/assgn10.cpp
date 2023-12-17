//10.Given a positive integer N, check if it is a perfect number or not.

#include<iostream>
using namespace std;
int main(){
    int n;
    do{
	    cout<<"Enter a number = ";
	    cin>>n;
	    if(n<=0){
	    	cout<<"Number is invalid it less than 0!!!!"<<endl;
	    	cout<<"Please re-enter the number which is greater than 0 = ";
	    	cin>>n;
	    	}
    }while(n<=0);

    int sum = 0;
    for(int i=1;i<n;i++){
        if(n%i==0){
            sum +=i;
        }
    }
    if(n==sum)
        cout<<n<<" is a perfect number";
    else
        cout<<n<<" is not a perfect number";

    return 0;
}
