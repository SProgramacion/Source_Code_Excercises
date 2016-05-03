#include <iostream>
#include <string.h>
#include <math.h>

using namespace std;

int main(){
	
	string linea="";
	int n=0, L=0,K=0,M=0,cont=0;
	double r=0;
	cin>>n;
	string ar[3];
	ar[0]="P";
	ar[1] = "E";
	ar[2]="R";
	
	
	for (int i=0; i<n;i++){
		cin>>linea;
		L = linea.length();
		K = sqrt(L);
		
		K = (K*K)==L?K:K+1;

		string mat1[K][K];
		cont=0;
		for(int j=0; j<K; j++){
			for(int m=0; m<K; m++){
				mat1[j][m]= cont<L? linea.substr(cont,1):"*";
				cont++;
			}
		}
		for(int j=0; j<K; j++){
			for(int m=K-1; m>=0; m--){
				if(mat1[j][m]!="*"){
					cout<<mat1[m][j];
				}
			}
		}
		cout<<endl;
	}	
	return 0;
}
