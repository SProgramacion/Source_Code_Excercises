#include <bits/stdc++.h>
using namespace std;
int main()
{
	int n, b, t;	
	while(scanf("%d%d%d", &n, &b, &t) != EOF)
	{
		long bt = 0, tt= 0;
		int auxb = 0, auxt= 0;
		bool fb = false, ft = false;
		while ( n > 0)
		{			
			if(auxb==0)
				auxb = n>=b?b:n, n-=b, auxb++, fb = true;			
			if(n <= 0)
				break;
			if(auxt==0)
				auxt = n>=t?t:n, n-=t, auxt++, ft = true;			
			if(n <= 0)
				break;			
			//printf("%d %d\n", auxb, auxt);
			while(auxb > 0 && auxt > 0)
			{
				auxt--, auxb--;
				if(!fb)
					bt++;
				else
					fb = false;
				if(!ft)
					tt++;
				else
					ft = false;
			}
			//printf("-- %ld %ld\n", bt, tt);
		}
		while(auxb--)
		{
			if(!fb)
				bt++;
			else
				fb = false;	
		}
		while(auxt--)
		{
			if(!ft)
				tt++;
			else
				ft = false;
		}
		printf("%ld %ld\n", bt, tt);
			
	}
}
