package overloding;

class parent
{
	void view()
	{
		System.out.println("parentclass");
	}
}

public class child extends parent {
	void view()
	{
		System.out.println("child class");
	}

	public static void main(String[] args) {
		
		parent ob1=new parent();
		ob1.view();
		child ob2=new child();
		ob2.view();
		
		// TODO Auto-generated method stub

	}

}
