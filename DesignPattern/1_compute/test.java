package designPattern.c1;

public class test {
	static Operation oper ;
	@SuppressWarnings("static-access")
	public static void main(String args[])
	{
		oper = new OperationFactory().createOperation('/');
		oper._numberA = 1;
		oper._numberB = 2;
		double result = oper.getResult();
		System.out.println(result);
	}

}
