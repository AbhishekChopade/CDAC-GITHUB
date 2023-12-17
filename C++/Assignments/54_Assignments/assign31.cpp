// 31. Write a program to sort five user entered strings into alphabetical order. Use dynamic memory
// allocation to store strings.

#include<iostream>
#include<cstring>
#include<cstdlib>
using namespace std;

int main(){
    char temp[20];
    char *t;
    int n = 5;
    int l;
    char *str[n];
    for(int i=0;i<n;i++){
        cout<<"Enter name at position "<<i+1<<endl;
        cin>>temp;
        l = strlen(temp);
        str[i] = (char *)malloc(sizeof(char)*l+1);
        strcpy(str[i],temp);
    }
    for(int i=0;i<n-1;i++){
        for(int j=i+1;j<n;j++){
            if(strcmp(str[i],str[j])>0){
                t = str[i];
                str[i] = str[j];
                str[j] = t;
            }
        }
    }
    cout<<"Sorted names in alphbetical order = "<<endl;
    for(int i=0;i<n;i++){
        cout<<str[i]<<endl;
    }
    for(int i=0;i<n;i++){
        free(str[i]);
    }
}

