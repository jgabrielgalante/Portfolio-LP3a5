package miltin.threads.produtorConsumidor;

public class main {

	public static void main(String[] args) {
		Number n = new Number(0);
		Producer p = new Producer(n);
		Consumer c = new Consumer(n);
		Consumer c1 = new Consumer(n);
		Consumer c2 = new Consumer(n);
		
				
		p.start();
		c.start();
		c1.start();
		c2.start();

	}

}
