#include <bits/stdc++.h>
using namespace std;
int match(int P)
{
	if(P==1 || P==0)
		return 0;
	return P/2 + match(P%2==0?P/2:P/2+1);
}
int main()
{
	int P;
	while(scanf("%d", &P) != EOF)
	{
		printf("%d\n", P==0?0:--P);
	}
}
