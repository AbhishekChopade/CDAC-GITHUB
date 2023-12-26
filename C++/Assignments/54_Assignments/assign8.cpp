// 8. Write a program to accept the basic salary and total sales amount for a salesperson and
// calculate commission according to sales amount. Display the net salary and commission earned.
// (Net Salary = Basic Salary + Commission) The range is as follows.
// Sales Amount in Rupees         Commission on Sales
//     5000 to 7500                         3%
//     7501 to 10500                        8%
//     10501 to 15000                       11%
//     15000 and above                      15%

#include<iostream>
using namespace std;

int main()
{
    float bsal;
    float tSales, netSal, commission;

    cout<<"Enter the Basic Salary = ";
    cin>>bsal;
    cout<<"Enter the total sales amount = ";
    cin>>tSales;
    if(tSales>=5000 && tSales<=7500)
        commission = (tSales*3)/100;
    else if(tSales>=7501 && tSales<=10500)
        commission = (tSales*8)/100;
    else if(tSales>=10501 && tSales<=15000)
        commission = (tSales*11)/100;
    else    
        commission = (tSales*15)/100;

    netSal = bsal + commission;

    cout<<"Net salary = "<<netSal<<endl;
    cout<<"Commission = "<<commission<<endl;
}