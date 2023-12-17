#include<iostream>
#include<fstream>
using namespace std;

int main(){
    // ofstream onfile;
    // //onfile.open("E:\\CDAC_SEP2023_MAIN\\Modules\\C++ Programming\\Codes\\C++ Practice\\FileHandling\\textfile.txt");
    // onfile.open("textfile1.txt");  //when file doesn't exists it creates automatically
    // onfile<<"Thank you so much"<<"\n"<<"You are welcome";
    // cout<<"Data has been written";
    // onfile.close();

    ifstream infile;
    string str;
    infile.open("Product.txt");
    while (getline(infile,str))
    {
        cout<<str<<"\n";
    }
    // while (infile >> str) {       //this prints word by word
    //         cout << str << endl;
    //     }
    infile.close();


    return 0;
}