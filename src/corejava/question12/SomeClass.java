package corejava.question12;

import java.util.concurrent.CyclicBarrier;

public class SomeClass {
	
	public static void main(String[] args) {
		CyclicBarrier barrier = new CyclicBarrier(2);
		
		Runnable r1 = ()->{
			try{
				System.out.println("before in r1");
				barrier.await();
				System.out.println("after in r1");
			}
			catch(Exception ex){
				
			}
		};
		
		Runnable r2 = ()->{
			try{
				System.out.println("before in r2");
				barrier.await();
				System.out.println("after in r2");
			}
			catch(Exception ex){
				
			}
		};
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();		
	}

}
