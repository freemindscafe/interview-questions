package corejava.question11;

public class SomeClass {
	
	public static void show(){
		System.out.println("static method called");
	}
	
	public static void main(String[] args) {
		SomeClass obj = null;
		obj.show();
	}

}

//NullPointerException
//Compile Time Error
//Will print 'static method called' [Correct]
//None of the above
