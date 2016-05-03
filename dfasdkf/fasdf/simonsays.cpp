#include <vector>
#include <iostream>
#include <stdio.h>
#include <string.h>
using namespace std;

int main()
{
  bool flag;
  int N, i;
  char entrada;
  char simos[11];
  simos[0]='S';
  simos[1]='i';
  simos[2]='m';
  simos[3]='o';
  simos[4]='n';
  simos[5]=' ';
  simos[6]='s';
  simos[7]='a';
    simos[8]='y';
      simos[9]='s';
        simos[10]=' ';
    //string simos="Simon says ";
    //string entrada;
  scanf("%d\n", &N);
  while(N--)
    {
      flag=true;
      //cout<<N<<endl;;
      for(i=0;i<11;i++)
	{
	  scanf("%c", &entrada, 1);
	  if( entrada!=simos[i])
	{
	  flag=false;
	}
	}
      while(scanf("%c", &entrada, 1)!=EOF)
	{
	  if(flag)
	    printf("%c", entrada);
	  if(entrada=='\n')
	    {
	    break;
	    }
	}
      //printf("\n");
    }
  return 0;
}
