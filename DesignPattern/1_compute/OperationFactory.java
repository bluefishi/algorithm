package designPattern.c1;

public class OperationFactory {
	public static Operation createOperation(char operate)
	{
		Operation oper = null;
		int temp = 0;
		temp = operate;
		switch(temp)
		{
		case '+':
			oper = new OperationAdd();
			break;
		case '-':
			oper = new OperationSub();
			break;
		case '*':
			oper = new OperationMul();
			break;
		case '/':
			oper = new OperationDiv();
			break;
		default://还没有实现其他的运算
			break;
		}
		return oper;
	}
	

}
