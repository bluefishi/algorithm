package designPattern.c6;

public class Finery extends Person{
	protected Person component;
	//´ò°ç
	public void Decorate(Person component)
	{
		this.component = component;
	}
	@Override
	public void show() {
		if(component !=null)
			component.show();
	}

}
