package corejava.question7;

public class SomeClass {

	 

    private String code = new String("vinod");

 

    public void matchCodeName(String[] codeArr) {

        for (String code : codeArr) {

            if (this.code == code) {

                System.out.println(code);

            }

        }

    }

 

    public static void main(String[] args) {

        String[] codeArr = new String[] { "Agent Vinod", "vinod", "James Bond" };

        new SomeClass().matchCodeName(codeArr);

    }

}

//vinod

//Agent Vinod

//will not print anything [CORRECT]

//Agent Vinod
//vinod


