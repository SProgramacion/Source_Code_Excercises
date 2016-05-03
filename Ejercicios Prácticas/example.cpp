#include <iostream>
#include <algorithm>
#include <string.h>
#include <sstream>

using namespace std;

int main(){
	int a=0,b=0,n=0, cont=0;
	cin>>a;
	cin>>b;
	string res="";
	
	int va[a];
	int vb[b];
	
	for	(int i=0; i<a;i++){
		cin>>va[i];
	}
	sort(va, va + a);
	stringstream oss;
	
	for	(int i=0; i<b;i++){
		cin>>n;
		for	(int j=0; j<a;j++){
			if(va[j]<=n){
				cont++;	
			}else{
				j=a;
			}
		}
		if(i==(b-1)){
			oss << cont;
		}else{
			oss << cont << " ";
		}
		
		res=res + oss.str();
		
		cont=0;
		oss.str("");
	}
	cout<<res<<endl;
	return 0;
}
