// 5. Write a program to calculate Net Salary of an employee. Accept Basic Salary (BS) from the user.

// HRA is 15% of BS
// DA is 30% of BS
// PF is 12.5% of GS
// Gross Salary is BS + HRA + DA
// Net Salary = Gross Salary – PF

#include<iostream>
using namespace std;

int main()
{
    float BS;
    float HRA,DA,PF,GS,NS;
    cout<<"Enter the Basic Salary=";
    cin>>BS;
    HRA = (15 * BS) / 100;
    DA = (30 * BS) / 100;
    GS = BS + HRA + DA;
    PF = (12.5 * GS) / 100;
    NS = GS - PF;

    cout<<"Net salary = "<<NS;
}