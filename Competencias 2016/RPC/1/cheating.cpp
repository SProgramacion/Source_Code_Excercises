#include<bits/stdc++.h>
using namespace std;
int main() {
	int T; cin >> T;
	for (int i=0; i<T; i++) {
		int x, y, d; cin >> d >> x >> y;
		if (x == 0 && y == 0) puts("0"); else if(x*x+y*y<d) puts("2"); else printf("%d\n",1+(int)(sqrt((x*x+y*y)/1.0/d)-1e-9));
	}
}

