#include <iostream>
using namespace std;

template <typename D > D calculo(D a)
{
	if(a>0)
	    return a;
    else
	    return a*-1;
}

int main ()
{
	cout<<"\n\n\t\tel valor absoluto es :"<<calculo(-5.22);
	cout<<"\n\n\t\tel valor absoluto es :"<<calculo(-468078501100.22);
	cout<<"\n\n\t\tel valor absoluto es :"<<calculo(22);
	cout<<"\n\n\t\tel valor absoluto es :"<<calculo(1005006000980054);
}
