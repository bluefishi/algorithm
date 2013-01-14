package designPattern.c1;

public abstract class Operation {
	double _numberA;
	double _numberB;
	
//	public Operation()
//	{
//		this._numberA = numA;
//		this._numberB = numB;
//	}
	void setNumberA(double value){
		this._numberA = value;
	}
	void setNumberB(double value)
	{
		this._numberB = value;
	}
	
	double getNumberA()
	{
		return this._numberA;
	}
	double getNumberB()
	{
		return this._numberB;
	}
	abstract double getResult();
}
