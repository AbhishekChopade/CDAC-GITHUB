// 3. Design (define what all constructors, member functions and operator functions to overload relational operators) and implement them.
//    Also write a small program to demonstrate the use of String class and overloaded relational operators.

#include<iostream>
#include<string.h>
using namespace std;
class String{

    string str;

    public:
    String();
    String(string s);
    void Accept();
    void Display();
    int operator ==(String s);
};

String::String(){
    str = "CDAC";
}

String::String(string s){
    str = s;
}

void String::Accept(){
    cin>>str;
}
void String:: Display(){
    cout<<str<<endl;
}
int String::operator ==(String s){
        if(str==s.str)
            return 1;
        else
            return 0;
}



int main(){
    String s1;
    cout<<"Enter the string for s1 = "<<endl;
    s1.Accept();
    String s2;
    cout<<"Enter the string for s2 = "<<endl;
    s2.Accept();
    cout<<"String s1 = ";
    s1.Display();
    cout<<"String s2 = ";
    s2.Display();
    if(s1==s2)
        cout<<"Strings are equal"<<endl;
    else
        cout<<"Strings are not equal"<<endl;
}

// #include<iostream>
// #include<stdio.h>
// #include<string.h>
// using namespace std;

// class String
// {
//         char str[20];
//         public:

//         void getdata()
//         {
//              //gets(str);
//              cin>>str;

//         }

//          int operator ==(String s)
//         {
//             if(!strcmp(str,s.str))
//                 return 1;
//             else
//                 return 0;
//         }
// };

// int main()
// {
//         String s1,s2;

//         cout<<"Enter first string :: ";
//         s1.getdata();
//         cout<<"\nEnter second string :: ";
//         s2.getdata();
//         if(s1==s2)
//         {
//             cout<<"\nStrigs are Equal\n";
//         }
//         else
//         {
//             cout<<"\nStrings are Not Equal\n";
//         }
        
//         return 0;
// }