// Copy the source string "src" into destination string "dest".
// void StrCpy(char dest[], char src[]);
#include<iostream>
using namespace std ;
//using ptr '*'
void StrCpy(char src[], char dest[]){
    char* destptr = dest;
    char* srcptr = src;

    while(*srcptr!='\0'){
        *destptr = *srcptr;
        *destptr++;
        *srcptr++;
    }
    *destptr = '\0';

    // cout<<"destination = " <<dest;


}
int main()
{
   char src[]="Hello world";
   char dest[20];
   cout<<"Source = "<<src<<endl;
   StrCpy(src,dest);
   cout<<"Dest = "<<dest<<endl;

}





// //using subscript opeartor'[]'
// void StrCpy(char dest[], char src[]);

// int main()
// {
//    char src[]="Hello world";
//    char dest[20];
//    cout<<"Source = "<<src<<endl;
//    StrCpy(dest,src);
//    cout<<"Destination = "<<dest<<endl;
// }

// void StrCpy(char dest[], char src[])
// {
//    int i =0;
//     while(src[i]!='\0'){
//          dest[i]=src[i];
//          i++;
//     }
//     dest[i] ='\0';
    

// }

