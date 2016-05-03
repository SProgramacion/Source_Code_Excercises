
#include<iostream>
using namespace std;
#define SIN_TIPO string

int main() {
	int a;
	int acum=0;
	int acumtotal=0;
	string corre;
	int i;
	int j;
	string resul;
	int t;
	cin >> t;
	for (i=1;i<=t;i++) {
		cin >> corre;
		a = corre.size();
		for (j=0;j<a;j++) {
			resul = corre.substr(j,1);
			if (resul=="O") {
				acum = acum+1;
				acumtotal += acum;
			} else {
				acum = 0;
			}
		}
		acum = 0;
		cout << acumtotal << endl;
		acumtotal = 0;
	}
	return 0;
}

