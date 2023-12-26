// Create an abstract class Shape with pure virtual method area(). Create Rectangle, Circle, Square class. 
// Override the pure virtual method area(). Create object of the class and call respectively.

#include<iostream>
#include<fstream>
using namespace std;

const float PI = 3.14;
class Shape{
    public :
    Shape(){}
    virtual float area() = 0;
};
class Rectangle : public Shape{
    float length;
    float breadth;
    public:
    Rectangle()/*:length(10),breadth(20)*/{}
    Rectangle(float l, float b):length(l),breadth(b){
        this->length = l;
        this->breadth = b;
    }

    float area(){
        return length*breadth;
    }

};

class Circle : public Shape{
    float radius;
    public:
    Circle():radius(10){
        cout<<"Default Constructor"<<endl;
    }
    Circle(float r):radius(r){
        this->radius = r;
    }

    float area(){
        return PI*radius*radius;
    }

};
class Square : public Shape{
    float side;
    public:
    Square():side(10){
        cout<<"Default Constructor"<<endl;
    }
    Square(float s):side(s){
        this->side = s;
    }

    float area(){
        return side*side;
    }

};


int main(){
    Rectangle rect(12.5,23.4);
    float rectArea = rect.area();
    cout<<"Area of a rectangle = "<<rectArea<<endl;

    Circle circ(12);
    float circArea = circ.area();
    cout<<"Area of a circle = "<<circArea<<endl;

    Square sqre(25);
    float sqreArea = sqre.area();
    cout<<"Area of a square = "<<sqreArea<<endl;

    ofstream outfile("shapes.txt");
    if (outfile.is_open()){
        outfile << "Area of a rectangle = "<<rectArea<<endl;
        outfile << "Area of a circle = "<<circArea<<endl;
        outfile << "Area of a square = "<<sqreArea<<endl;
        outfile.close();
        cout<<"Data is saved to 'shapes.txt'."<<endl;
    }else {
        cout << "Error: Unable to open the file for writing." << std::endl;
    }

    ifstream infile("shapes.txt");
    string line;
    if(infile.is_open()){
        while(getline(infile,line)){
            cout<<line<<endl;
        }
        infile.close();
    }
    else {
        cout << "Error: Unable to open the file for reading." << std::endl;
    }




}