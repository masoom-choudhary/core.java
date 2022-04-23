package inherit;


    class TestParentClass
    {
    	int var = 100;
    }
    
    class TextChildClass extends TestParentClass
    {
    	int var= 50;
    
    
    void display()
    {
    	System.out.println("The var value of child: "+var);
    	System.out.println("The var value of parent: "+super.var);
    }
    }
    

public class Super {

	public static void main(String[] args) {
		TextChildClass tcc=new TextChildClass();
		tcc.display();
		
		
		// TODO Auto-generated method stub

	}

}
