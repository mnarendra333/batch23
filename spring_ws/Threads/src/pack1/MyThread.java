package pack1;

public class MyThread extends Thread{

	@Override
	public void run() {
		for (int i = 1; i <=5; i++) {
			System.out.println(Thread.currentThread().getName()+i);
		}
	}
	public static void main(String[] args) {
	
		MyThread t1 = new MyThread();
		t1.setName("mythread");
		t1.start();
		
		for (int i = 1; i <=5; i++) {
			System.out.println(Thread.currentThread().getName()+i);
		}
		
		
	}
	
	
}
