package Runnableej9;

public class CuentaAtrasRunnable extends Thread {
	int c;
	String id;

	public CuentaAtrasRunnable(){
		
	}
	public CuentaAtrasRunnable(String v, int c) throws InterruptedException {
		
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
