#include <iostream>
#include <string.h>
	
	using namespace std;
	
	int main(){
		
		string linea="",say="Simon says";
		char *s3 = "Simon says";
		int n=0, L=0,K=0,M=0,cont=0;
		double r=0;
		cin>>n;
		
		for (int i=0; i<n;i++){
			cout<<"Digite "<<i<<endl;
			cin>>linea;
			cout<<"L"<<linea.substr(0,10)<<endl;
			if(linea.substr(0,10)=="Simon says"){
	   cout << " S1 Contains S2";
	}else{
		 cout << " S1 no Contains S2";
	}
		}
		return 0;
	}
