package overloding;

public class Oerloading {
	
	int add(int a, int b)
	{
		return a+b;
		
	}
	int add(int a, int b, int c)
	{
		return a+b+c;
	}

	public static void main(String[] args) {
		
		Oerloading ob=new Oerloading();
		System.out.println(ob.add(5, 5));
		System.out.println(ob.add(5, 5, 9));
		// TODO Auto-generated method stub

	}

}
