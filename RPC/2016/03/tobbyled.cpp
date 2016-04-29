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

int main ()
{
   //freopen("00","r",stdin); 
   //freopen("00.out","w",stdout);
   long long N, T;
   char D;
   while(scanf("%lld%lld %c", &N , &T, &D) != EOF)
   {
      string a, b, c, d;
      getchar();
      getline(cin, a);
      getline(cin, b);
      getline(cin, c);      
      for(long long i= 0;i<(long long)b.size();i++)
	 if(b[i]!='|')d+=" ";
      for(long long i=0; i<(long long)b.size();i++)
      {
	 if(b[i] != '|'&&b[i] != ' ')
	 {
	    long long e;
	    if(D=='R')
	    {
	       e = i/2 + T%N;
	       e = e >= N?e%N:e;	       
	    }
	    else
	    {
	       e = i/2 - T%N;
	       e = e < 0?N-(abs(e)%N):e;	       
	    }
	    d[e] = b[i];
	    // if(2*e + 1 >= (int)b.size())
	    //    cout<<"error"<<'\n';
	 }// else if(b[i]=='|')
	  //   d[i / 2] = b[i];
	 	 
      }
      // for(int i=0;i<2*N +1; i++)
      // {
      // }
      cout<<a<<'\n';
      // cout<<d<<'\n';
      rep(i, N)
      {
	 cout<<'|'<<d[i];
      }
      cout<<"|\n"<<c;
      cout<<'\n';
   }
   
      
   
   return 0;
}
