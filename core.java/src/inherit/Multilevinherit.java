package inherit;

class hi
{
	void disp1()
	{
		System.out.println("Welcomr yadav");
	}
}

class by extends hi
{
	void disp2()
	{
		System.out.println("noor");
	}
}

class ef extends cd
{
	void disp3()
	{
		System.out.println("four");
	}
}

class gh extends ef
{
	void disp4()
	{
		System.out.println("three");	
	}
	
}

public class Multilevinherit {

	public static void main(String[] args) {
		gh obj1=new gh();
		obj1.disp1();
		obj1.disp2();
		obj1.disp3();
		obj1.disp4();
		
		
		
		// TODO Auto-generated method stub

	}

}
