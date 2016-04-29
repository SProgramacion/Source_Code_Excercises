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
   //freopen("ex.in","r",stdin); 
   //freopen("ex.out","w",stdout);
   
   string a, b;
   while(true)
   {
      getline(cin, a);
      if (cin.eof()) 
	 break;
      getline(cin, b);
      if(cin.eof())
	 break;
      vector<string> tokens, tokens2;
      istringstream iss1(a);
      istringstream iss2(b);
      tokens.push_back("");
      copy(istream_iterator<string>(iss1),
	   istream_iterator<string>(),
	   back_inserter(tokens));
      copy(istream_iterator<string>(iss2),
	   istream_iterator<string>(),
	   back_inserter(tokens2));
      bool f = true;     
      for(int i = 0; i<(int)tokens.size();i++)
      {
	 //cout <<tokens[i]<< tokens2[i]<<'\n';
	 if(tokens[i][0] != tokens2[i][0])
	 {
	    f = false;
	    break;
	 }	 
      }
      if(f)
	 printf("yes\n");
      else
	 printf("no\n");
   }
   return 0;
}
