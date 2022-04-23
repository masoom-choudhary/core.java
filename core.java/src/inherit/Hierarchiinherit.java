package inherit;

class ONE
{
	void disp1()
	{
		System.out.println(" One");
	}
}

class Two extends ONE
{
	void disp2()
	{
		System.out.println("Two");
	}
}

class three extends ONE
{
	void disp3()
	{
		System.out.println("Three");
	}
}

class four extends ONE
{
	void disp4()
	{
		System.out.println("Four");	
	}
	
}

class five extends ONE
{
	void disp5()
	{
		System.out.println("noor");	
	}
	
}

public class Hierarchiinherit {

	public static void main(String[] args) {
		
		
		five obj1=new five();
	    obj1.disp1();
	    obj1.disp5();
	    
	    
	    four obj2=new four();
	    obj2.disp1();
	    obj2.disp4();
	    
	    
	    three obj3=new three();
	    obj3.disp1();
	    obj3.disp3();
	    
	    Two obj4=new Two();
	    obj4.disp1();
	    obj4.disp2();
	    
	
	
		// TODO Auto-generated method stub

	}

}
