package inherit;

class ab
{
	void disp1()
	{
		System.out.println("One");
	}
}

class cd extends ab
{
	void disp2()
	{
		System.out.println("Two");
	}
}

public class sininherit {

	public static void main(String[] args) {
		
		cd obj=new cd();
		obj.disp1();
		obj.disp2();
		
		// TODO Auto-generated method stub

	}

}
