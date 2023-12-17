#include<iostream>
#include<cstring>
#include<vector>
using namespace std;

class Account{
    static int num;
    int accNo;
    string accName;
    string accType;
    float accBal;

    public:
    Account(){
        //accNo;
    };
    Account(string name,string type, float bal):accName(name),accType(type),accBal(bal){
        accNo = num++;
        accName = name;
        accType = type;
        accBal = bal;
    }

    void setAccDetails(){
        accNo = num++;
        cout<<"Enter the account details name, type(current or saving), bal : ";
        cin>>accName>>accType>>accBal;
        
    }

    void displayDetails(){
        cout<<"accNo = "<<accNo<<" , "<<"accName = "<<accName<<" , "<<"accType = "<<accType<<" , "<<"accBal = "<<accBal<<endl;
    }

    void withdraw(){
        float bal;
        float amt;
        cout<<"Enter amount to be withdrawn = ";
        cin>>amt;
        if(amt<=accBal){
            bal = accBal- amt;
            if(bal>=1000 && accType =="current"){
                cout<<"Amount is withdrawn from your current account"<<endl;
                accBal -= amt;
                cout<<"Your updated balance is "<<accBal<<endl;
            }
            else if((accBal-amt)>=0 && accType == "saving"){
                cout<<"Amount is withdrawn from your saving account"<<endl;
                accBal -= amt;
                cout<<"Your updated balance is "<<accBal<<endl;    
            }
            else    
                cout<<"You cannot withdraw amount from account because it is more than your default balance"<<endl;
        }
        else
            cout<<"Invalid amount"<<endl;
    }
     void deposit(){
        float amt;
        cout<<"Enter amount to be deposited = ";
        cin>>amt;
        if(amt>0){
           cout<<"Amount is deposited to your account"<<endl;
                accBal += amt;
                cout<<"Your updated balance is "<<accBal<<endl;  
        }  
        else
            cout<<"Invalid Amount"<<endl;   
     } 
    
    int getAccNo(){
        return accNo;
    }

    

};
// int Account::getAccNo(){
//     return accNo;
// }

int Account::num=100;

int main(){
    vector<Account> accounts;
    int choice;
    int cnt = 0;
    bool flag = true;
    int ano;
    float amt;
    string type;
    while(flag){
        cout<<"1. Add account "<<endl;
        cout<<"2. Withdraw amount "<<endl;
        cout<<"3. Deposit amount"<<endl;
        cout<<"4. Display all account details "<<endl;
        cout<<"5. Display individual account details"<<endl;
        cout<<"6. Exit"<<endl;
        std::cin>>choice;
        switch (choice)
        {
        case 1:
            accounts.push_back(Account("Abhi","current",15000));
            //cnt++;
            break;
        // case 2:
        //     cout<<"Enter account number = ";
        //     cin>>ano;
        //     for(int i=0;i<cnt;i++){
        //         if(ano==acc[i].getAccNo()){
        //            acc[i].withdraw();
        //         }
        //     }
        //     break;
        // case 3:
        //     cout<<"Enter account number  = ";
        //     cin>>ano;
        //     for(int i=0;i<cnt;i++){
        //         if(ano==acc[i].getAccNo()){
        //            acc[i].deposit();
        //         }
        //     }
        //     break;
        case 4:
            for(int i=0;i<cnt;i++){
                cout<<"Details for account"<<i+1<<" : ";
                accounts[i].displayDetails();
            }
            for(Account a1:accounts){
                a1.displayDetails();
            }
            break;
    //    case 5:
    //         cout<<"Enter account number = ";
    //         cin>>ano;
    //         cout<<"Details for account no "<<ano<<" : ";
    //         for(int i=0;i<cnt;i++){
    //             if(ano==acc[i].getAccNo()){
    //                acc[i].displayDetails();
    //             }
    //         }
    //         break;

       case 6:
            flag = false;
            break;
        }
    }

}