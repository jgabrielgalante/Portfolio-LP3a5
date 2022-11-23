package miltin.threads.produtorConsumidor;

public class Consumer extends Thread{
	Number number;
	
	Consumer(Number number) {
		this.number = number;
	}
	
	@Override
	public void run() {
		int value = 0;
		
		for(int k=0; k<10; k++) {
			value = this.number.consume(this.getName());	
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
