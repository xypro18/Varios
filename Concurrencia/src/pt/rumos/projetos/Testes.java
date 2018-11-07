package pt.rumos.projetos;

class Thread1 implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " : start");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName() + " : end");
	}
	
}

public class Testes {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println(Thread.currentThread().getName() + " : start");
		
		//Thread thread1 = new Thread(new Thread1(), "thread1");
		//thread1.setName("thread1");
		
		Thread outra = new Thread( () -> System.out.println("olá") );
		outra.start();
		
		Thread outra2 = new Thread(
				new Runnable () {

					@Override
					public void run() {
						System.out.println("Outra Thread");
						
					}
					
				}
				
				);
		
		outra2.start();
		
		Thread[] thread1 = new Thread[10];
		for(int i=0;i<thread1.length; i++) {
			thread1[i] = new Thread(new Thread1());
		}
		
		for(Thread t: thread1) {
			t.start();
		}
		
		
		thread1[4].join();
		thread1[7].join();
		
	//	thread1.start();
		
	//	thread1.join();

		System.out.println(Thread.currentThread().getName() + " : end");
	}

}
