#include <iostream>
using namespace std;

int main(){

    int row=0, col=0;
    cin >> row >> col;

    int** matix = new int*[row];

    for (int i = 0; i < row; i++) {
		matix[i] = new int[col];
	}

    for (int i = 0; i<(2*row); i++){
        for(int k = 0; k < col; k++){
            if(i<row) {
                int plus_Num=0;
                cin >> plus_Num;
                matix[i][k] = plus_Num;
            }

            else{
                int plus_Num=0;
                cin >> plus_Num;
                matix[i-3][k] += plus_Num;
            }
        }
    }

    for (int i = 0; i<row; i++){
        for(int k =0; k<col; k++){
            cout << matix[i][k] << " ";
        }
        cout << endl;
    }

    for(int i=0; i<row; i++){
        delete[] matix[i];
    }
    delete[] matix;


    return 0;

}