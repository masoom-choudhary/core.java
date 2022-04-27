package statickeyword;

public class Staticmethod {
	static int j=100;//static variable 
	static int n=200;//instance variable
     static void  a()
     {
    	 int a=200;//local variable
    	 System.out.println("print from a");
    	 n=30;
    	 a2();
    	// System.out.println(super.j);
    	 
     }
     
 static    void a2()//instance method 
     {
    	 System.out.println("inside a2");
     }
	public static void main(String[] args) {
		
		Staticmethod ob=new Staticmethod();
		ob.a2();
		Staticmethod.a();
		// TODO Auto-generated method stub

	}

}
