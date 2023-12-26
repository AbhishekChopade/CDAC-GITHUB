// 21. Write a menu driven program, which allows the user to select either a circle or rectangle.
// a. Write a single function areaCircum() that calculates the area and circumference of a circle.
// The values of area and circumference should be printed in main()
// b. Write a single function areaPeri() that calculates the area and perimeter of a rectangle. The
// values of area and perimeter should be printed in main()

#include<iostream>
using namespace std;
const double PI = 3.14;
double areaCircum(int r,double *areaCir,double *circumCir){
    
    *areaCir = (PI*r*r);
    *circumCir = (2*PI*r);
}

double areaPeri(int l,int b,double *areaRe,double *periRe){
    *areaRe = l*b;
    *periRe = 2*(l+b);

}

int main(){
    int choice;
    while(true){
        cout<<"1. Calculate area and circumference of a circle"<<endl;
        cout<<"2. Calculate area and perimeter of a rectangle"<<endl;
        cout<<"3. Exit"<<endl;
        cin>>choice;

        switch(choice){
            case 1:
                int r;
                cout<<"Enter the radius of a circle = "<<endl;
                cin>>r;
                double areaCir, circumCir;
                areaCircum(r,&areaCir,&circumCir);
                cout<<"Area of a circle = "<<areaCir<<endl; 
                cout<<"Circumference of a circle = "<<circumCir<<endl; 
            break;

            case 2:
                int l,b;
                cout<<"Enter the length and breadth of a rectangle = "<<endl;
                cin>>l>>b;
                double areaRe, periRe ; 
                areaPeri(l,b,&areaRe,&periRe);
                cout<<"Area of a rectangle = "<<areaRe<<endl; 
                cout<<"Perimeter of a rectangle = "<<periRe<<endl; 
            break;
                
            case 3:
                exit(0);
            break;
        }

    }
    
}