// 30. Write a program that calculates the average marks of all the subjects. The number of subjects
// ‘n’ is accepted from the user. Allocate memory dynamically for ‘n’ integers. Free the memory
// when not in use.


#include<iostream>
using namespace std;

int main(){
    int n;
    float *marks;            
    float avg;
    float sum=0;
    cout<<"Enter the number of subjects = "<<endl;
    cin>>n;
    cout<<"Enter the marks of all subjects = "<<endl;
    marks = (float *)malloc(sizeof(float)*n);               //allocates the memory
    for(int i=0;i<n;i++){
        cin>>marks[i];
    }
    for(int i=0;i<n;i++){
        sum+=marks[i];
    }

    avg = sum/n;
    cout<<"Average of all marks = "<<avg;
    free(marks);                              //de-allocates the memory
}