package designPattern.c6;
/* װ��ģʽ
 * ��̬��Ϊһ���������һЩ�����ְ��
 * */
public class test {
	public static void main(String args[])
	{
		Person xc = new Person("С��");//�����಻��ʵ����
		System.out.println("��һ�ִ��·���");
		BigTrouser bt = new BigTrouser();
		TShirts ts = new TShirts();
		//װ�ι���
		bt.Decorate(xc);
		ts.Decorate(bt);
		ts.show();
		
		System.out.println("�ڶ��ִ��·���");
		BigTrouser bt2 = new BigTrouser();
		TShirts ts2 = new TShirts();
		//װ�ι���
		ts2.Decorate(xc);
		bt2.Decorate(ts2);
		bt2.show();
	}
}
