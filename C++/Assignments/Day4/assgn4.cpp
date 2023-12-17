//4. Find prime numbers between two positive integers N and M, including N and M.
#include<iostream>
using namespace std;
int main(){
    int n,m;
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

    bool flag;
    while(n<=m){
        flag = true;
        for(int i=1;i<=n/2;i++){
            if(i==1)
                continue;
            if(n%i==0){
                flag = false;
                break;
            }
        }
        if(flag==true)
            cout<<n<<" ";
        n++;
    }
} 