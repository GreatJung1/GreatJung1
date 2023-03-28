#include<iostream>

using namespace std;

int main(){

    int nan[9];
    int i=0;
    int k=0;
    int temp=0;
    int sum=0;

    for(i=0; i<9; i++){
    cin >> nan[i];
    sum += nan[i];
   }

    for (i=0; i<9; i++){
        for(k=0; k<8-i; k++){
            if(nan[k]> nan[k+1]){
                temp = nan[k];
               nan[k] = nan[k+1];
               nan[k+1] = temp;
            }
        }
    }


    for(i=8; i>0; i--){
        for(k=i-1; k>=0; k--){
            if(sum- (nan[i]+nan[k]) ==100){
                for (int j=0; j<9; j++){
                    if(j != i && j != k){
                    cout << nan[j] << endl;
                    }
                } 
            }
        }
    }

    return 0;
}