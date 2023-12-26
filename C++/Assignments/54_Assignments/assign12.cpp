// Write a program to print whether user entered number is an Armstrong number. 
//  Armstrong number is one for which the sum of the cube of all its digits is same as the number.  For example, 153 = (1*1*1) + (5*5*5) + (3*3*3)
#include<iostream>
using namespace std;

int main()
{
    
    int num,r;
    int power = 1;
    cout<<"Enter the Number in 3 digits =";
    cin>>num;
    int n = num;
    int m = num;
    int digits = 0;
    int sum = 0;
    while(n>0)
    {
        digits++;
        n = n / 10;
       
    }
    while(m>0){       //153
        r = m%10;
        m = m/10;
        for(int i=0;i<digits;i++){
            power *= r;    //power = power *r;
        } 
        sum += power;
        power = 1;   
    }

    if(num == sum)
        cout<<num<<" is an armstrong number"<<endl;
    else
        cout<<num<<" is not an armstrong number"<<endl;

}
