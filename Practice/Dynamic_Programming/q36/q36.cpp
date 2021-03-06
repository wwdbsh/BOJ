#include <iostream>
#include <algorithm>

using namespace std;

int dp[5001][5001];
string a, b;

int main(void){
    cin >> a >> b;
    int n = a.length();
    int m = b.length();
    for(int i = 0; i <= n; i++){
        for(int j = 0; j <= m; j++){
            if(i == 0 && j == 0){
                continue;
            }
            if(i == 0){
                dp[i][j] = j;
                continue;
            }
            if(j == 0){
                dp[i][j] = i;
                continue;
            }
            if(a[i] == b[j]){
                dp[i][j] = dp[i-1][j-1];
            }else{
                dp[i][j] = 1 + min(dp[i-1][j-1], min(dp[i-1][j], dp[i][j-1]));
            }
        }
    }
    cout << dp[n][m] << "\n";
}