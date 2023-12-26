// 16. Write a program for matchstick game between the computer and the user. Your program
// should ensure that the computer always wins. Rules for the game are as follows:
// a. There are 21 matchsticks
// b. The computer asks the player to pick 1, 2, 3, or 4 matchsticks.
// C. Player is given the chance to pick the sticks first then the computer picks the sticks.
// d. Whoever is forced to pick up the last matchstick loses the game.

#include<iostream>
using namespace std;

int main(){
    int matchsticks=21;
    int pick;
    while(matchsticks!=1){

        do{
            cout<<"Pick matchsticks between 1 to 4"<<endl;
            cin>>pick;
        }while(pick<=0 || pick>=5);
        cout<<"Counter picks - "<<5-pick<<endl;
        matchsticks = matchsticks - 5;
        cout<<"Number of matchsticks left - "<<matchsticks<<endl;

    }
    cout<<"1 matchstick is remaining.... "<<endl;
    cout<<"Computer wins !!"<<endl;

}



