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
int conver(int a)
{
    if(a == 2)
	return 5;
    else if(a == 5)
	return 2;
    else if(a == 6)
	return 9;
    else if(a == 9)
	return 6;
    return a;
}
int main ()
{
    //freopen("ex.in","r",stdin);
    //freopen("ex.out","w",stdout);
    ios_base::sync_with_stdio(false);
    string input;
    while(cin>>input)
    {
	if(cin.eof())
	    break;
	int ar[26];
	rep(i, 26)		    
	    ar[i] = -1;
	int count = 0;
	for(int i = 0; i < input.size(); i++)
	{
	    if(ar[input[i] - 'a'] == -1)
	    {
		ar[input[i] - 'a'] = ++count;
		if(ar[input[i] - 'a'] < 10)
		{
		    cout<<conver(ar[input[i] - 'a']);
		}else
		{
		    cout<<conver(ar[input[i] - 'a']/10)*10+conver(ar[input[i] - 'a']%10);
		}
	    }else
	    {
		if(ar[input[i] - 'a'] < 10)
		{
		    cout<<conver(ar[input[i] - 'a']);
		}else
		{
		    cout<<conver(ar[input[i] - 'a']/10)*10+conver(ar[input[i] - 'a']%10);
		}
	    }
	}
	cout<<'\n';
    }
    return 0;
}

