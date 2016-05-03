#include <cstdio>
using namespace std;
int main()
{
  int aux=0, i=0, n=0, k=0;
  bool flag=false;
  scanf("%i %i", &n, &k);
  int ith[n];
  for(i=0;i<n;i++)
    {
      scanf("%i", &ith[i]);
    }
    for(i=0;i<n;i++)
    {
      if(ith[i]<=0||ith[i]<ith[k])
	{
	  //printf("%i", &i);
	  aux=i;
	  flag=true;
	  break;
	}
    }
    if(!flag)
      aux=n;
    printf("%i\n", aux);
    return 0;
}
