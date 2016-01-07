package corejava.question13;

public class Base {
	public Base() {
		method();
	}
	public void method() {
		System.out.println("In Base");
	}
	
	public static void main(String[] args) {
		Base base = new Derived();
		base.method();
}
}

class Derived extends Base {
	private String bar;
	public Derived() {
		bar = "bar";
	}
	public void method() {
		System.out.println(bar.length());
	}
}



