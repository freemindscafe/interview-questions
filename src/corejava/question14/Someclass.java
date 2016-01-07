package corejava.question14;

public class Someclass {
	public static void main(String[] args) {
		int i = 1;
		try{
			throw new IllegalStateException();
		}
		catch(IllegalStateException ex){
			throw new RuntimeException();
		}
		catch(Exception ex){
			System.out.println("caught");
		}
		finally{
			System.out.println("finally");
		}
	}

}
