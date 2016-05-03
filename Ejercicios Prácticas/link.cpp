#include <bits/stdc++.h>
using namespace std;
int match(int P)
{
	if(P==1 || P==0)
		return 0;
	return P/2 + match(P%2==0?P/2:P/2+1);
}
int main()
{
	int P;
	scanf("%d", &P);
	string s, aux, output = "";
	//map <string, int> my_map;
	//char array[26]
	while(P--)
	{
		aux = "";
		int outp;
		cin >> s;
		int len = s.length() ;
		for(int i = 0; i < s.length(); i++)
		{
			aux ="";			
			int j = i;			
			aux +=s.substr(i, len-i); 													
			aux += s.substr(0, i); 
			if(i == 0)
				output = aux, outp = i;
			else
			{
				if(output.compare(aux) > 0)
					output = aux, outp = i;				
			}
		}
		printf("%d\n", ++outp);	
		//my_map.clear();
	}
}
