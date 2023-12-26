// 22. Write a program to accept date, month, year from the user in a function called getDate(), and
// print that date in main() in dd/mm/yy format.

#include<iostream>
using namespace std;
void getData(int *dd,int *mm,int *yy){
    int date,month,year;
    cout<<"Enter date, month, year = ";
    cin>>date>>month>>year;
    *dd = date;
    *mm = month;
    *yy = year;

}
int main(){
    int dd,mm,yy;
    getData(&dd,&mm,&yy);
    cout<<"Date = "<<dd<<"/"<<mm<<"/"<<yy<<endl;

}