package academy.devdojo.maratona_java.javacore.ZZAclassesInternas.test;

public class OuterClassTest02 {

    private String name = "Rafael";

    void print(final String p) {
        final String lastName  = "Paz"; //tem que ser final ou efetivamente final

        class LocalClass {
            public void printLocal() {
                System.out.println(p);
                System.out.println(name + " " + lastName);
            }
        }

        LocalClass local = new LocalClass();
        local.printLocal();
    }


    public static void main(String[] args) {
        OuterClassTest02 outerClass = new OuterClassTest02();
        outerClass.print("Nome");
    }
}
