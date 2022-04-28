package constant;

abstract class shape
{
	abstract void draw();
	void hai()
	{
		System.out.println("hello");
	}
}

public class Abs extends shape {
	
	void draw()
	{
		System.out.println("draw");
	}

	public static void main(String[] args) {
		
		Abs ob1 =new Abs();
		ob1.draw();
		// TODO Auto-generated method stub

	}

}
