package designPattern.c2;

public class test {
	public static void main(String args[])
	{
		/*�ڲ�ͬʱ��ʹ�ò�ͬ��ҵ�����*/
		CashContext csuper = new CashContext("��300��100");//�����շѣ���8��
		double totalPrices = 0d;
		totalPrices = csuper.GetResult(200);
		System.out.println(totalPrices);
	}

}
