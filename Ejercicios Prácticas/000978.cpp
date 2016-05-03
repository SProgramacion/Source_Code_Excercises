#include<bits/stdc++.h>

#define mod 1000000007
#define pow2(i) (1<<i)
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
#define fill(a, val) memset(a,val, sizeof(a))

using namespace std;

int main()
{
	int tc, sg, sb, b, power;
	scanf("%d", &tc);
	while(tc--)
	{
		scanf("%d %d %d", &b, &sg, &sb);
		multiset<int> green;
		multiset<int> blue;
		rep(a, sg)
		{
			scanf("%d", &power);
			green.insert(power);
		}
		rep(a, sb)
		{
			scanf("%d", &power);
			blue.insert(power);
		}
		//bool wg = false, wb = false, lo = false;
		vector<int>gv,bv;
		while(green.size()>0 && blue.size() > 0)
		{
			//printf("srER\n");
			multiset<int>::iterator it;
			multiset<int>::iterator it1;
			int rondas = 0;	   
			it1  = blue.end();
			it  = green.end();
			if(blue.size() == 0 ||green.size() == 0)
			{
				break;
			}
			int ij= 0;
			while(blue.size() > 0 && green.size() > 0)
			{
				ij++;				
				--it1;
				--it;			
				if(*it > *it1)
				{
					//printf("%d %d %d\n", ij, *it, *it1);
					int value = *it -*it1;
					gv.push_back(value);
					blue.erase(it1);
					green.erase(it);
				}
				else if(*it < *it1)
				{
					//printf("%d %d %d\n", ij, *it, *it1);
					int value = *it1 - *it;
					bv.push_back(value);
					green.erase(it);
					blue.erase(it1);
				}
				else
				{
					blue.erase(it1);
					green.erase(it);
				}
				rondas++;
				if(rondas == b)
					break;
				if(it==green.begin() || it1==blue.begin())
					break;
			}
			//printf("here\n");
			for (int i = 0, sz = gv.size(); i < sz; i++)
				green.insert(gv[i]);

			for (int i = 0, sz = bv.size(); i < sz; i++)
				blue.insert(bv[i]);
			
			gv.clear();
			bv.clear();
			//break;
		}

		if(green.size()>blue.size())
		{
			printf("green wins\n");
			for(multiset<int>::reverse_iterator it = green.rbegin(); it!=green.rend(); ++it)
			{
				printf("%d\n", *it);
			}
		}
		else if(green.size()<blue.size())
		{
			printf("blue wins\n");
			for(multiset<int>::reverse_iterator it = blue.rbegin(); it!=blue.rend(); ++it)
			{
				printf("%d\n", *it);
			}
		}
		else if(green.size() == 0 && blue.size() == 0)
			printf("green and blue died\n");
		if(tc)
			printf("\n");
	}
	
	return 0;
}
