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
#define repi(i, n) REPI(i, 1, n)
#define PB push_back
#define MP make_pair
#define fill(a, val) memset(a,val, sizeof(a))
using namespace std;
char board[101][101];
int move(int size)
{
	int n_mv = 0;
	rep(a, size)
	{
		rep(b, size)
		{
			if(board[a][b] == 'w')
			{
				if(board[a-1][b] == '-')
					board[a-1][b] = 'w', n_mv++;
				if(board[a+1][b] == '-')
					board[a+1][b] = 'w', n_mv++;
				if(board[a-1][b-1] == '-')
					board[a-1][b-1] = 'w', n_mv++;
				if(board[a+1][b+1] == '-')
					board[a+1][b+1] = 'w', n_mv++;
				if(board[a+1][b-1] == '-')
					board[a+1][b-1] = 'w', n_mv++;
				if(board[a-1][b+1] == '-')
					board[a-1][b+1] = 'w', n_mv++;
				if(board[a][b+1] == '-')
				board[a][b+1] = 'w', n_mv++;
				if(board[a][b-1] == '-')
					board[a][b-1] = 'w', n_mv++;
			}
		}
	}
	return n_mv;
}
int main()
{
	int tc;
	scanf("%d", &tc);
	while(tc--)
	{
		fill(board, 'b');
		int size;
		scanf("%d", &size);
		repi(a, size)
		{
			repi(b, size)
			{
				scanf(" %c", &board[a][b]);
			}			
		}		
		int moves = 1, movesN = 0;
		while(moves)
		{
			moves = move(size);
			movesN += moves;
		}

		printf("%d\n", movesN);
		/*repi(a, size)
		{
			repi(b, size)
			{
				printf("%c", board[a][b]);
			}
			printf("\n");
			}*/
	}
	return 0;
}

