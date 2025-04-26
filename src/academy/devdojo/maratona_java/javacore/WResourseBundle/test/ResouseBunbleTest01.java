package academy.devdojo.maratona_java.javacore.WResourseBundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResouseBunbleTest01 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        ResourceBundle bundle = ResourceBundle.getBundle("messages", new Locale("en", "US"));
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));
        System.out.println(bundle.getString("hi"));
        //Locale("fr","CA") fall-back(procurar algo em outro lugar quando nao acha no local original)
        //messages_fr_CA.properties
        //messages_fr.properties
        //messages_pt_BR.properties
        //messages_pt.properties
        //messages.properties
        //Lança um excessão
    }
}
