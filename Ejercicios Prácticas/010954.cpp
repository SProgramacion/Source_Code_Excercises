#include <bits/stdc++.h>
//#include <queue>

#define mod 1000000007
#define pow2(i) (1<<i)
#define bit(i) (1<<i)
#define isOdd(i) (i&1)
#define isEven(i) (!(i&1))
#define sz(i) i.size()
#define REP(i, b, n) for (int i = b; i < n; i++)
#define REPI(i, b, n) for (int i = b; i <= n; i++)
#define rep(i, n) REP(i, 0, n)
#define repi(i, n) REPI(i, 1, n)
#define PB push_back
#define MP make_pair
#define fill(a, val) memset(a,val, sizeof(a))

using namespace std;
int main ()
{
	long long tc, tmp;
	while(scanf("%lld", &tc), tc)
	{
		long long tm=tc;
		priority_queue<long long> prio;
		while(tm--)
		{
			scanf("%lld", &tmp);
			prio.push(tmp*-1LL);
		}
		long long sum = 0LL, cost = 0LL;
		while(prio.size()!=1)
		{
			sum = 0LL;
			sum += prio.top();
			prio.pop();
			sum += prio.top();
			cost += sum;
			prio.pop();
			prio.push(sum);
		}
		cost *= -1LL;
		printf("%lld\n", cost);
	}
	return 0;
}
