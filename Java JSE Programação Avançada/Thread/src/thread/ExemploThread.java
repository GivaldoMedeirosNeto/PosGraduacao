package thread;

public class ExemploThread extends Thread{

	public void run() {
		
			try {
				for(int i = 0; i < 20; i++) {
					System.out.print(i);
					Thread.sleep(1000);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
	}
	
}
