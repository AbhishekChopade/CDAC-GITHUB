
// For String, Date and Array classes do following:
// - Identify member functions that should be made constant member function and convert them to constant member functions.
// - Identify where all objects should be passed by reference and make the changes.
//   Also, make changes at appropriate places, to pass them as reference to constant objects.    - Overload assignment operator, to perform deep copy.

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
		String(const String &obj)
		{  //obj.str = "abcd";
            size = obj.size;
            str = new char[size];
			strcpy(str,obj.str);
		}	

		String& operator=(String &obj) //const
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
        string getString() const{
            return str;
        }
};


int main(){

	String s1("Hello World");
	cout<<"String s1 = ";
	s1.display();
    string str1 = s1.getString();
    cout<<"str1 = "<<str1<<endl;
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
