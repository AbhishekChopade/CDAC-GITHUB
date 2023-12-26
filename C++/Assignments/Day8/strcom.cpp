// 3. Compare the two strings and return true if they are same else return false.
// bool Compare(char s1[], char s2[]);

//using poiter '*'
#include<iostream>
using namespace std;
bool Compare(char *ptr1, char *ptr2)
{
    int i=0;
    while( *(ptr1+i)!='\0' && *(ptr2+i)!='\0' )
    {
        if(*(ptr1+i) != *(ptr2+i)){
            return false;
    
        }
        i++;
    }
    return (*(ptr1+i)=='\0') && (*(ptr2+i)=='\0') ;

}

int main()
{
  char s1[]="Hello";
  char *ptr1=s1;
  char s2[]="Hellow";
  char *ptr2=s2;

    bool compare= Compare(ptr1, ptr2);
    if(compare)
        cout<<"same";
    else
        cout<<"not same";
}




//using subscript operator '[]'
// bool Compare(char s1[], char s2[]){
//     int i = 0;
//     while(s1[i]!='\0' || s2[i]!='\0'){
//         if(s1[i]!=s2[i]){
//             return false;
//         }
//         i++;
//     }
//     return s1[i]=='\0'&&s2[i]=='\0';

// }

// int main(){
//     char s1[20]; //= "Hello";
//     cout<<"Enter the string s1 = ";
//     cin>>s1;
//     char s2[20];// = "Hello";
//     cout<<"Enter the string s2 = ";
//     cin>>s2;
//     bool comp = Compare(s1,s2);
//     if(comp == true)
//         cout<<"s1 and s2 are same";
//     else 
//         cout<<"s1 and s2 are not same";

// }