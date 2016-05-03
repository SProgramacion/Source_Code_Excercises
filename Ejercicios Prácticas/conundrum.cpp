#include <iostream>
#include <string.h>

using namespace std;

int main(){
	
	string linea="";
	int cont=0,pos=0;
	cin>>linea;
	string ar[3];
	ar[0]="P";
	ar[1] = "E";
	ar[2]="R";
	
	
	for (int i=0; i<linea.length();i++){
		pos=(i==0 || i==1 || i==2)?i:(i%3);
		if(linea.substr(i,1)!=ar[pos]){
			cont++;
		}
	}
	cout<<cont<<endl;
	
}
