#include <cstdio>
#include <math.h>
using namespace std;
int main()
{
  int N,R,S,X,Y, W;
  double p,d;
  scanf("%d", &N);
  while(N--)
    {
      scanf("%d %d %d %d %d", &R, &S, &X,&Y,&W);
      p=(double)1/S;
      p*=(double)((S-R)+1);
      //printf("%lf", p);
      p = pow(p,X);
      d=Y-X;
      d=d/(double)Y;
      d=d==0?1:d;
      p/=d;
      p=p*(double)W;
      if(p>1)
	printf("yes\n");
      else
	printf("no\n");
    }
 return 0;}
