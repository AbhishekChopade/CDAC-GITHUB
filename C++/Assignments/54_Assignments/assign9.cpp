//Using switch-case construct, write a menu driven program to perform basic calculations (addition, subtraction, multiplication and division) 
//on two user entered numbers.
#include<iostream>
using namespace std;

int main()
{
   int n1,n2,choice;

   cout<<"Enter number1 = "<<endl;
   cin>>n1;
   cout<<"Enter number2 = "<<endl;
   cin>>n2;
   do{
        cout<<"Enter choice 1.Additon 2.Subtraction 3.Multiplication 4.Division 5.Exit"<<endl;
        cin>>choice;
        switch(choice)
        {
            case 1:
                cout<<"Addition="<<n1 + n2<<endl;
                break;
            case 2:
                cout<<"Subtraction="<<n1 - n2<<endl;
                break;
            case 3:
                cout<<"Multiplication="<<n1 * n2<<endl;
                break;
            case 4:
                cout<<"Division="<<n1 / n2<<endl;
                break;  
            case 5:
                cout<<"Exit"<<endl;
                break;  

        }
   }while(choice!=5);
}