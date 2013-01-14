package designPattern.c1;

public class OperationDiv extends Operation{

	
	@Override
	double getResult() {
		if(super._numberB!=0)
			return super._numberA/super._numberB;
		else
			return 0;
	}

}
