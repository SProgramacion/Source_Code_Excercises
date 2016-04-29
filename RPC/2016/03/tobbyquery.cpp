#include <bits/stdc++.h>
/**************************************************************
*Author       --> LosPro	                              *
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

typedef vector<int> vi;

int main()
{
   //freopen("ex.in","r",stdin); 
   //freopen("ex.out","w",stdout);
   int n, q, l, r;
   while(scanf("%d", &n) != EOF)
   {
      int a[n], s[10][n + 1];
      rep(i, 10)
      {
	 s[i][0] = 0;
      }
      repi(i, n)
      {
	 scanf("%d", &a[n]);
	 s[a[n]][i] = s[a[n]][i - 1] + 1;      	 
	 rep(k,10)
	 {
	    if(k != a[n])
	       s[k][i] = s[k][i-1];
	 }      	 
      }
      scanf("%d", &q);
      rep(i, q)
      {
      	 scanf("%d%d", &l, &r);
      	 --l;
      	 int cnt = 0;
      	 rep(j, 10)
      	 {
      	    if(s[j][r] - s[j][l] > 0)
	       cnt++;	       
	 }
	 printf("%d\n", cnt);
      }
   }
   return 0;
}
