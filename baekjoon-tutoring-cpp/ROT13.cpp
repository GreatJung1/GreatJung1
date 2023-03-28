#include<iostream>
#include<string> // string 사용할떄 

using namespace std;

int main(){
    
    string b_Str;
    getline(cin, b_Str); // 이거쓰면 공백도 받음

    for ( int i =0; i<b_Str.size(); i++){
        b_Str[i]= (int)(b_Str[i]);

    }

//cout << (int)(b_Str[0]);
//a가 97 z가 122 차이는 25
//A가 65 Z가 90... 25..

    for ( int i =0; i<b_Str.size(); i++){
        if(b_Str[i] >= 97 && b_Str[i] <= 122){
        
            if(b_Str[i] >= 115){
                b_Str[i]-=10;   
                b_Str[i]+=13; 
                b_Str[i]+=10; 
                b_Str[i] -= 26;  
            }
        

            else
            {
                b_Str[i]+=13;

                if(b_Str[i] > 122)
                b_Str[i] -= 26;
            }
        }
        else if(b_Str[i] >=65 && b_Str[i] <= 90){
        b_Str[i]+=13;

            if (b_Str[i] > 90)
            {
              b_Str[i] -= 26;
            }
        }
    }

    for ( int i =0; i<b_Str.size(); i++){
        b_Str[i]= (char)(b_Str[i]);
    }
    cout << b_Str;

    return 0;

}

// 이거 문자는 127까지만 표현되니까 숫자가 127넘어가면 표현이 안됨.. 아스키 코드로 솜누자 다룰때 이점에 주의하기