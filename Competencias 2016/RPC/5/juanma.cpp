#include <bits/stdc++.h>
/**************************************************************
*Problem Name --> 					      *
*Author       --> Sebastreak                                  *
*Date 	      --> 05/16/2016				      *
*Platform     -->					      *
*Compiler     --> GNU GCC 4.9.0                               *
***************************************************************/
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
long long sum, n;
long long parts(long long n)
{
    rep(j, n)
    {
	rep(i, n)
	{
	    if(i>j)
	    {
		if(j == 0)
		    sum++;
		else
		{
		    if(abs(j - i) > 1)
		    {
			sum += (long long)((abs(j-i) - 1LL)*(long long)j + 1LL);
		    }else
			sum++;
		}
	    }
	}
    }
    return sum;
}
int main ()
{
    //freopen("ex.in","r",stdin);
    //freopen("ex.out","w",stdout);
    int tc;
    scanf("%d", &tc);
    while(tc--)
    {
	sum = 1LL;
	scanf("%lld", &n);
	printf("%lld\n", parts(n));
    }
    return 0;
}
