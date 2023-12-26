// 5. In the given string, convert all upper case chanracters to lower case.
// void ToLower(char s[]);


#include<iostream>
using namespace std;

//using pointer '*'
void ToLower(char str[]){
    char *ptr = str;
    while(*ptr != '\0'){
        if(*ptr>='A'&& *ptr<='Z'){
            *ptr = *ptr+32;
        }
        *ptr++;
    }
     
    

}

int main(){
    char str[] = "HELLO";
    
    cout<<"Upper Case = "<<str<<endl;
    ToLower(str);
    cout<<"ToLower = "<<str<<endl;

}




//using subscript operator '[]'
// void ToLower(char s[]){
//     int i = 0;
//     while(s[i]!='\0'){
//         if(s[i]>='A'&&s[i]<='Z'){
//             s[i] = s[i]+32;
//         }
//         i++;
//     }
     

// }

// int main(){
//     char str[] = "HELLO";
//     cout<<"Upper Case = "<<str<<endl;
//     ToLower(str);
//     cout<<"Lower Case = "<<str<<endl;
// }