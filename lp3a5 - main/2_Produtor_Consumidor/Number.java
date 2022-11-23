package miltin.threads.produtorConsumidor;

public class Number {	
	private int number;	
	private boolean available;
	
	Number(int number) {
		this.number = number;
		this.available = false;
	}
	
	public synchronized void produce(String idThread, int value) {
		while(this.available == true) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.available = true;
		this.number = value;	
		notifyAll();
		System.out.println("Producer  " + idThread + "\t produced: \t" + value);
		
	}

	public synchronized int consume(String idThread) {
		while(this.available == false) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
				
		System.out.println("  Consumer " + idThread + "\t consumed: \t" + this.number);
		this.available = false;
		notifyAll();
		return this.number;	
	}
	
}
