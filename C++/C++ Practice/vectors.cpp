#include<iostream>
#include<vector>
using namespace std;

int main(){
vector<int> nums;

nums.push_back(1);  
cout<<nums.at(0)<<endl; 
nums.push_back(1);  
nums.push_back(1);  

nums.push_back(10);  
nums.push_back(2);  
nums.push_back(13);  
nums.push_back(15);  
nums.push_back(16);  
nums[8]=9;
nums.push_back(17);
nums.push_back(21);
nums.pop_back();
nums.push_back(22);
for(int i=0;i<nums.size();i++){
    cout<<nums[i]<<" "<<nums.at(i)<<endl;

}
 cout<<nums[9]<<endl;
 //cout<<nums<<endl;
 vector<double> nums2(5,10.1);
 for(double n:nums2){
    cout<<n<<endl;
 }



}