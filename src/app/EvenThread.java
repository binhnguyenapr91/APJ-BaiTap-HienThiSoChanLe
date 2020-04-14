package app;

public class EvenThread extends Thread{
	public void run() {
		for(int i =0;i<10;i++) {
			if(i%2==0) {
				System.out.println(this.getName() +" "+ i);
			}
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
	}

}
