package miltin.threads.produtorConsumidor;

public class Productor extends Thread {
	Number number;
	
	Produtor(Number number) {
		this.number = number;
	}
	
	@Override
	public void run() {
			for(int k= 0; k<10; k++) {
				number.produce(this.getName(), k);
				try {
					sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
				
	}
	
	

}
