package designPattern.c2;

public class test {
	public static void main(String args[])
	{
		/*在不同时间使用不同的业务规则*/
		CashContext csuper = new CashContext("满300减100");//正常收费，打8折
		double totalPrices = 0d;
		totalPrices = csuper.GetResult(200);
		System.out.println(totalPrices);
	}

}
