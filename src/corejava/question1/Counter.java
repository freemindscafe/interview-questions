package corejava.question1;

public class Counter implements Runnable {
	
	private int i;
	
	public Counter(int i){
		this.i = i;
	}

	@Override
	public void run() {
		System.out.print(i);
	}
	
	public static void main(String[] args) {
		Thread counter1 = new Thread(new Counter(1));
		Thread counter2 = new Thread(new Counter(2));
		Thread counter3 = new Thread(new Counter(3));
		
		counter1.run();
		counter2.run();
		counter3.run();
	}

}

//Output of the above code will be
//321
//231
//123 [CORRECT]
//Will print 1 and 2 and 3; but the order can't be predicted.
