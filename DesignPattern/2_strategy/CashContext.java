package designPattern.c2;

public class CashContext {
	private CashSuper cs;
	public CashContext(String type)
	{
		if(type.equals("�����շ�"))
			cs = new CashNormal();
		else if(type.equals("��300��100"))
			cs = new CashReturn("300","100");
		else if(type.equals("��8��"))
			cs = new CashRebate("0.8");
	}
	public double GetResult(double money)
	{
		return cs.acceptCash(money);
	}

}
