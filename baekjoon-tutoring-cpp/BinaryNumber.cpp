#include<iostream>
#include<cmath> // 제곱할떄 사용


using namespace std;

int main(){

    int a[10] = {0};
    int b[20] = {0};

    int num;
    int i=0;
    int k=0;

    cin >> num;

    for(i=0; i<num; i++){
        cin >> a[i];
    }

    for(i=0; i<num; i++){
        for (k=0; k<20; k++){
            b[k] = (int)(a[i]/pow(2, 19-k));


            if(((int)(a[i]/pow(2, 19-k)))>0){
                a[i] = (a[i] % (int)(pow(2, 19-k)));
            }

        }
        for(k=19; k>=0; k--){
            if(b[k]==1){
                cout << 19-k;
                cout << " ";
            }
        }
        cout << endl;
    }

    return 0;
}