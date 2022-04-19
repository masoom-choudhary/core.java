package shiv;

public class cloud {
	
	int Yearofpurchase;    //Data member
	String model;          //Data member
	double coat;           //Data member
	
	public void disp1 ()   //Member function
	{
		System.out.println("Year of purchase= "+2001);
		System.out.println("make "+"suzuki");
	}
	
	public void disp2()  // Member Function
	{
		System.out.println("model "+1999);
		System.out.println("coat "+200000);
	}
	

	public static void main(String[] args) {
		cloud hai =new cloud();
		cloud bye =new cloud();
		hai.disp1();
		bye.disp2();
		// TODO Auto-generated method stub
        
	}

}
