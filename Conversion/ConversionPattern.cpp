#include <iostream>
using namespace std;


template <class T,class U>
class Conversion{
public:
	virtual U convertor(T inp);
};

class MeterToKiloMeter : public Conversion<double,double> {
public:
	double convertor(double meter){
		double km = meter/1000;
		return km;
	}
};

class CharToInt : public Conversion<char,int>{
public:
	int convertor(char ch){
		int ascii = ch;
		return ascii;
	}
};



int main() {
	// your code goes here
	
	Conversion<double,double>* ptr = new MeterToKiloMeter;
	double data = 10.2;
	double out = ptr->convertor(data);
	
	cout<<"Conversion of meter to kilometer\n";
	cout<<data<<"m --> ";
	cout<<out<<"km"<<"\n";
	
	
	Conversion<char,int> * ptr2 = new CharToInt;
	char data2 = 'a';
	
	int out2 = ptr2->convertor(data2);
	cout<<"Conversion of char to ascii value\n";
	cout<<"'a' --> ";
	cout<<out2<<"\n";
	
	
	
	return 0;
}
