package statickeyword;

public class Demo {
	static int a;
	static int b;
	static
	{
		a=10;
		b=20;
		System.out.println("hi");
		
	}
	void ab()
	{
		System.out.println("welcome");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("value of a is="+b);
		System.out.println("value of a is="+b);
		Demo ob=new Demo();
		ob.ab();
		
		
	}

}
