package first;

class thread2 extends Thread{
	public void run() {
		for(int i=0;i<30;i++) {
		System.out.println("hello");
	}
	}
}

class thread1 extends Thread{
	public void run() {
		for(int i=0;i<30;i++) {
		System.out.println("hi");
	}
	}
}
public class thread{
	public static void main (String[] args) throws InterruptedException {
		thread2 t1=new thread2();
		thread1 t2=new thread1();
		t1.start();
		
		t2.start();
	}
}