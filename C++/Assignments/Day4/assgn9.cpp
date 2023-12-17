//9. Given a positive integer N, check if its palindrome or not. A palindrome number is a number that is same as its reverse.
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

    int temp = n;
    while(temp>0){
        r = temp%10;
        revn = (revn*10)+r;
        temp = temp/10;
    }
    if(n==revn)
        cout<<n<<" is a palindrome number ";   
    else
        cout<<n<<" is not a palindrome number ";
    

    return 0;
}
