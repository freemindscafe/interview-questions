package corejava.question10;

public class SomeClass {
	
	public static void main(String[] args) {
		try{
			System.out.println("try");
			throw new RuntimeException();
		}
		catch(Exception ex){
			System.exit(0);
			System.out.println("catch");
		}
		finally{
			System.out.println("finally");
		}
	}

}

//try
//catch
//finally

//finally

//try
//finally

//try [Correct]
