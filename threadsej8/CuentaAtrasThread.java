package threadsej8;

public class CuentaAtrasThread extends Thread {
	int c;
	String id;


	public CuentaAtrasThread(){
		
	}
	public CuentaAtrasThread(String v, int c) throws InterruptedException {
		
		this.c = c;
		this.id = v;

		
	}
	 public void run() {
		 while (c >= 0) {
				System.out.println(id + " - " + c);
				--c;
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
	    }

}
