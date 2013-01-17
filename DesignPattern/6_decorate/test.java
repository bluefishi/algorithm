package designPattern.c6;
/* 装饰模式
 * 动态地为一个对象添加一些额外的职责
 * */
public class test {
	public static void main(String args[])
	{
		Person xc = new Person("小菜");//抽象类不能实例化
		System.out.println("第一种穿衣方案");
		BigTrouser bt = new BigTrouser();
		TShirts ts = new TShirts();
		//装饰过程
		bt.Decorate(xc);
		ts.Decorate(bt);
		ts.show();
		
		System.out.println("第二种穿衣方案");
		BigTrouser bt2 = new BigTrouser();
		TShirts ts2 = new TShirts();
		//装饰过程
		ts2.Decorate(xc);
		bt2.Decorate(ts2);
		bt2.show();
	}
}
