package corejava.question6;

public class SomeClass {

	 

    public static void method(SomeClassInner i1, SomeClassInner i2) {

        i2 = new SomeClassInner("C");

        i1.name = "D";

    }

 

    public static void main(String[] args) {

        SomeClassInner i1 = new SomeClassInner("A");

        SomeClassInner i2 = new SomeClassInner("B");

        System.out.println(i1 + " - " + i2);

        SomeClass.method(i1, i2);

        System.out.println(i1 + " - " + i2);

    }

 

    public static class SomeClassInner {

        String name;

 

        public SomeClassInner(String name) {

            this.name = name;

        }

 

        public String toString() {

            return name;

        }

    }

}

//A - B [CORRECT]
//D - B

//A-B
//D-C

//A-B
//A-B

//A-B
//C-D

