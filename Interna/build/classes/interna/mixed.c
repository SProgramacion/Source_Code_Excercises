
#include<stdio.h>
int main()
{
  long p,q,r;
  while (scanf("%ld %ld",&p,&q)!=EOF)
  {
  	if (!p && !q) {
  		return 0;
  	}
    if (q>p)
    {
    	r=0;
  		printf("%ld %ld / %ld\n",r,p,q);  			
    } else
    {
    	r=p/q;
    	p=p-(r*q);
    	printf("%ld %ld / %ld\n",r,p,q);  			
    }
  }
  
}
