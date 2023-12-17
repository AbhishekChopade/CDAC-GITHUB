// In the given string, convert all lower case chanracters to upper case.
// void ToUpper(char s[]);
#include<iostream>
using namespace std;

//using subscript pointer '*'
void ToUpper(char str[])
{
    char *ptr = str;
    while(*ptr != '\0')
    {
        if(*ptr>='a' && *ptr<='z' )
        {
            *ptr = *ptr-32;
        }
        *ptr++;
    }
    
}


int main()
{
    char str1[]="hello";
    cout<<"Lower case = "<<str1<<endl;
    ToUpper(str1);
    cout<<"ToUpper = "<<str1<<endl;
}



// //using subscript operator  '[]'
// void ToUpper(char s[])
// {
//     int i=0;
//     while(s[i]!='\0' )
//     {
//         if(s[i]>='a' && s[i]<='z' )
//         {
//             s[i]=s[i]-32;
//         }
//         i++;
//     }
    
// }


// int main()
// {
//     char str1[]="hello";
//     cout<<"Lower case = "<<str1<<endl;
//     ToUpper(str1);
//     cout<<"ToUpper = "<<str1<<endl;
// }