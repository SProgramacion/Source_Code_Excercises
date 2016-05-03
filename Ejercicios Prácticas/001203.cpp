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
	int tmp1, tmp2,rep1;
	typedef pair <int, int> mypa1;
	typedef pair <mypa1, int> mypar;
	priority_queue<mypar> mypq;
	map<int, int> mymap;
	char input[8];
	int i = 1000;
	while(i--)
	{
		scanf("%s",input);
		if(input[0] == '#')
			break;
		scanf("%d %d", &tmp1, &tmp2);
		mymap[tmp1] = tmp2;
		mypq.push(make_pair(make_pair(tmp2*-1, tmp1*-1), 1));
	}
	scanf("%d", &rep1);
	int n  = 0, tp = 0;
	int topt = abs(mypq.top().first.first);
	//priority_queue<mypar> aux1;
	//priority_queue<mypar> aux2;
	//aux1 = mypq;
	//aux2 = mypq;
	int c = topt;
	while(tp != rep1)
	{
		priority_queue<mypar> aux;
		//aux1 = aux2;
		n++;
		//printf("%d %d\n", c, n);
		while(!mypq.empty())
		{
			if(abs(mypq.top().first.first) <= c)
			{
				tp++;
				printf("%d\n", abs(mypq.top().first.second));
				aux.push(make_pair(make_pair(mymap[abs(mypq.top().first.second)]*(mypq.top().second+1)*-1,mypq.top().first.second), mypq.top().second+1));
			}else
			{
				//printf("Noooo -> %d %d\n", abs(mypq.top().first.second),abs(mypq.top().first.first));
				aux.push(make_pair(mypq.top().first, mypq.top().second));
			}
			//aux1.pop();
			mypq.pop();
			//printf("NOOOOOOOO --> %d %d %d\n", abs(mypq.top().second), abs(mypq.top().first)*n, abs(mypq.top().first)*n<=c);
			//tp++;
			if(tp == rep1)
				break;
		}
		if(tp == rep1)
			break;
		mypq = aux;
		c++;
		//aux2 = aux1;
	}
    /*while(!mypq.empty())
	{
		printf("%d %d\n", mypq.top().first, mypq.top().second);
		mypq.pop();
	}
	*/
	
	
	return 0;
}
