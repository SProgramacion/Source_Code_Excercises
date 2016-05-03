#include <bits/stdc++.h>

#define pow2(i) (1L<<i)
#define bit(i) (1<<i)
#define isOdd(i) (i&1)
#define isEven(i) (!(i&1))
#define sz(i) i.size()
#define REP(i, b, n) for (int i = b; i < n; i++)
#define REPI(i, b, n) for (int i = b; i <= n; i++)
#define rep(i, n) REP(i, 0, n)
#define repi(i, n) REPI(i, 0, n)
#define PB push_back
#define MP make_pair

using namespace std;

int main()
{
	int n;
	long long answer = 0;
    scanf("%d",&n);
    for (int i=1; i<=n; i++)
	{        
        answer += 1LL<<(long long)i;
        //cout<<answer<<endl;
    }
	cout<<answer<<endl;
    return 0;
}
