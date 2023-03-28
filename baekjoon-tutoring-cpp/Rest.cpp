#include<iostream>

using namespace std;
int main(){

    int num[10]={0};
    int rest_Count[42]={0};
    int i=0;
    int count =0;

    for(i=0; i<10; i++){
        cin >> num[i];
        num[i] = num[i]%42;
    }

    for(i=0; i<10; i++){
        rest_Count[num[i]]++;
    }

    for(i=0; i<42; i++){
        if(rest_Count[i] > 0){
            count++;
        } 
    }

    cout << count;


    return 0;

}