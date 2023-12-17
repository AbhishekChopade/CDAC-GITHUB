#include<iostream>
#include<fstream>
using namespace std;

int main(){
    //copy one file to another
    ifstream infile;
    ofstream onfile;
    char str;
    infile.open("textfile1.txt");
    onfile.open("textfile2.txt");
    while (infile)
    {   infile.get(str);
        onfile.put(str);
    }
    
    cout<<"Data has been copied";
    infile.close();
    onfile.close();

    //delete file
    // int val = remove("textfile2.txt");
    // if(val==0)
    //     cout<<"File deleted";
    // else
    //     cout<<"file not deleted";


    return 0;
}