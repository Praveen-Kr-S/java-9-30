package Learn_threads;


class Mt extends Thread{
	
	public void run() {
//		System.out.println(Thread.currentThread().getName());
		System.out.println("Python "+Thread.currentThread().getName());
	}
	
}


class MD extends Thread{
	
	public void run() {
//		System.out.println(Thread.currentThread().getName());
		System.out.println("Java "+Thread.currentThread().getName());
	}
	
}


//Priority Thread
class Pre extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());
	}
}


//Demon Thread

class D extends Thread{
	public void run() {
		if (Thread.currentThread().isDaemon()) {
			System.out.println("It's Daemon Thread"+Thread.currentThread().getName());
		}
		else {
			System.out.println("It's Main Thread"+Thread.currentThread().getName());
		}
	}
}




public class Multi_level_Thread {
	
	public static void main(String[] args) throws InterruptedException {
//		Mt t0 = new Mt();
//		Mt t1 = new Mt();
//		MD t2 = new MD();
//		MD t3 = new MD();
		
//		t0.start();
//		t0.join();
//		t1.start();
//		t1.join();
//		t2.start();
//		t3.start();
		
		
//		Pre t = new Pre();
//		Pre t1 = new Pre();
//		Pre t2 = new Pre();
//		Pre t3 = new Pre();
//		
//		t.setPriority(1);
//		t1.setPriority(7);
//		t2.setPriority(10);
//		t3.setPriority(1); 
//		
//		
//		t.start();
//		t1.start();
//		t2.start();
//		t3.start();
		
		
		D t1 = new D();
		D t2 = new D();
		
		
		t1.start();
		t2.setDaemon(true);
		t2.start();

		
		
		
	}
	
	
	
	
	
	
	

}
