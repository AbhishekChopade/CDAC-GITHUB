// 1. In String class, implement following:
//    - Copy constructor to perform deep copy.
//    - Overload assignment operator, to perform deep copy.

#include <iostream>
#include<cstring>
using namespace std;


class String{
	private:
		char *str;
		int size;
	public :
		String():size(10)
		{	
            str = new char[size];
			str = "Default";
		}
		String ( char*ch)
		{   
            int length=strlen(ch);
            str = new char[length];
			strcpy(str,ch);
		}
		String(String &obj)
		{ 
            size = obj.size;
            str = new char[size];
			strcpy(str,obj.str);
		}	

		String& operator=(String &obj)
	    {  

            size=obj.size;
            delete[] str;
            str = new char[size];
			strcpy(str,obj.str);
            return *this;
		}
    
        ~String()
        {
            cout<<"Memory is deallocated";
            cout<<endl;
            delete[] str;
        }
	
        void display()
        {   
            for(int i=0;str[i]!='\0';i++){
            
                cout<<str[i];
            }
            cout<<endl;
        }
};
int main(){

	String s1("Hello World");
	cout<<"String s1 = ";
	s1.display();
	String s2(s1);
	cout<<"After the deep copy from copy constructor, String s2 =  ";
	s2.display();
	String s3;
    cout<<"String s3 = ";
    s3.display();
	s3=s1;
	cout<<"After the deep copy from assignment operator, String s3 =  ";
	s3.display();
    return 0;
}
