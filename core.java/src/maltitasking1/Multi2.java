package maltitasking1;

public class Multi2 extends Thread{
	 public void run() {
	 System.out.println("Thread " + Thread.currentThread().getName()
	+ " running");
	}
	public static void main(String[] args) {
	 
	 Multi2 th1 = new Multi2();
	 Multi2 th2 = new Multi2();
	 Multi2 th3 = new Multi2();
	 
	 th1.start();
	 th2.start();
	 th3.start();
	System.out.println("Priority of thread " + th1.getName() + " : " + 
	th1.getPriority());
	 System.out.println("Priority of thread " + th2.getName() + " : "
	+ th2.getPriority());
	 System.out.println("Priority of thread " + th3.getName() + " : "
	+ th3.getPriority());
	 
	}
	}
