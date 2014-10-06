package corejava.question2;

public class Test {

	public static void main(String[] args) {
		A a = new B();
		a.method1();
		a.method2();
	}
}

class A{
	
	public void method1(){
		System.out.println("In A's method1");
	}
	
	public static void method2(){
		System.out.println("In A's method2");
	}
}

class B extends A{
	
	public void method1(){
		System.out.println("In B's method1");
	}
	
	public static void method2(){
		System.out.println("In B's method2");
	}
}

//In A's method1
//In A's method2

//In B's method1
//In B's method2

//In B's method1 [CORRECT]
//In A's method2

//In A's method1
//In B's method2
