// 1. Given a string, return its length.
// int Strlen(char s[]);

#include<iostream>
using namespace std;

int Strlen(char *ptr)
{
    int len = 0;
    int i=0;
    while(*(ptr+i)!='\0'){
        len++;
        i++;
    }
    return len;
}

int main()
{
  char str[]="Hello";
  char *ptr = str;
  int length = Strlen(ptr);
  cout<<"Length = "<<length;
}


// int Strlen(char s[]);
// int main(){
//     char str[] = "Hello";
//     int length = Strlen(str);
//     cout<<"Length of String = "<<length;
// }

// int Strlen(char s[]){
//     int len = 0;
//     int i = 0;
//     while(s[i] != '\0'){
//         len++;
//         i++;

//     }
//     return len;

// }