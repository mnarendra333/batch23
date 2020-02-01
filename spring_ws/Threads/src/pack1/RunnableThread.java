package pack1;

public class RunnableThread implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <=5; i++) {
			System.out.println(Thread.currentThread().getName()+i);
		}
		
		try {
			Thread.sleep(120000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void main(String[] args) {
		
		
		RunnableThread obj = new RunnableThread();
		
		Thread t = new Thread(obj);
		t.start();
		
		for (int i = 1; i <=5; i++) {
			System.out.println(Thread.currentThread().getName()+i);
		}
		
		try {
			Thread.sleep(120000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
