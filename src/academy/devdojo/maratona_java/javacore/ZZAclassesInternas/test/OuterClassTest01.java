package academy.devdojo.maratona_java.javacore.ZZAclassesInternas.test;

public class OuterClassTest01 {

    private String name = "Rafael";

    //classes aninhadas ou nestedClass
    class InnerClass {
        //tem acesso a todos os objetos da classe externa
        public void printOuterClassAttribute() {
            System.out.println(name);
            System.out.println(this); //sempre se refere a classe em que ele se encontra.
            System.out.println(OuterClassTest01.this);
        }
    }

    public static void main(String[] args) {
        OuterClassTest01 outerClass = new OuterClassTest01();
        //OuterClassTest01.InnerClass innerClass = outerClass.new InnerClass();
        InnerClass innerClass2 = outerClass.new InnerClass();
        InnerClass innerClass = new OuterClassTest01().new InnerClass();
        innerClass2.printOuterClassAttribute();
        innerClass.printOuterClassAttribute();
    }
}
