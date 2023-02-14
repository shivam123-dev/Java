#include<bits/stdc++.h>
using namespace std;
int main() {
    int r,c;
    cin >> r >> c;
    vector<vector<int>>v;
    for(int i=0;i<r;i++) {
        for(int j=0;j<c;j++) {
            cin >> v[i][j];
        }
    }
    vector<int> count;
    for(int i=0;i<r;i++) {
        int c = 0;
        for(int j=0;j<c;j++) {
            if(v[i][j] == 1) {
                c++;
            }
        }
        count.push_back(c);
    }    
    int maxi = count[0];
    for(int i=1;i<count.size();i++) {
        maxi = max(maxi, count[i]);
    }
    cout << maxi << endl;
    return 0;
}