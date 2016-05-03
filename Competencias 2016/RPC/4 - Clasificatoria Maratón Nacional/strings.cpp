#include <bits/stdc++.h>
using namespace std;
int main()
{
	int q, y,z;
	char line[1000100];
	while(scanf("%s", line) != EOF)
	{
		scanf("%d", &q);		
		long S = strlen(line);
		for(int k=0;k<q;k++)
		{
			scanf("%d%d", &y, &z);
			--y, --z;							
			printf("%c\n", line[(y+z)%S]);
		}
	}
	return 0;
}
