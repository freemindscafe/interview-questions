package corejava.question5;

public class SomeClass {

	 

    public static int number = 10;

 

    public static void generateAndPrint(int x) {

        for (int i = 1; i <= x; i++) {

            if (i % number == 0) {

                System.out.println(i);

            }

        }

    }

 

    public static void main(String[] args) {

        SomeClass someClass = new SomeClass();

        someClass.generateAndPrint(76);

    }

}

//10 20 30 40 50 60 70
//10203040506070
//compile time error [CORRECT]
//null pointer exception


