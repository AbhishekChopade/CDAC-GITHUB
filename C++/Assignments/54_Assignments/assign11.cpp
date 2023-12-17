// Write a program to convert user entered character into its opposite case. 
// Program should also flash an error message if the character entered by the user is not an alphabet.

#include<iostream>
using namespace std;

int main(){
    char c;
    cout<<"Enter the Character [a-z] and [A-Z]= "<<endl;
    cin>>c;
    int i=c;
    if(i>=97 && i<=122)
    {   cout<<"Lower case "<<c;
        c = i - 32;
        cout<<" is converted to upper case "<<c<<endl;
    }
    else if(i>=65 && i<=90)
    {
        cout<<"Upper case "<<c;
        c = i + 32;
        cout<<" is converted to upper case "<<c<<endl;
    }
    else
        cout<<"Entered character is not an alphabet"<<endl;
    
}