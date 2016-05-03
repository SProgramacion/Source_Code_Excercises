#include <bits/stdc++.h>
using namespace std;
 char s1;

int getModulo(int t, int n){
	return (t%n);
}

 char * get(int a, int b, int c) {
 	string h="No";
 	bool state = true;
        if (c >= a || c >= b) {
            if (a == c || b == c) {
            	h = "Yes";
            	state=false;
            	
            }
            int r = 0;
            while (state) {
            	
            	if((r+a) <= c){
				
                r += a;
                if (getModulo(c - r, b) == 0) {
                    h = "Yes";
                    break;
                }
                }else{
                	state=false;
				}
            }
            r = 0;
            while (state) {
            	
            	if((r+a) <= c){
                r += b;
                if (getModulo(c - r, a) == 0) {
                     h = "Yes";
                     break;
                }
            }else{
            	state=false;
			}
            }
        }
        char * S = new char[h.length() + 1];
std::strcpy(S,h.c_str());
        return S;
    }
    
    int main(){
    	int a,b,c;
		while(scanf("%d %d %d", &a, &b, &c) != EOF)
		{
			printf("%s\n", get(a,b,c));
		}
    	return 0;
	}
