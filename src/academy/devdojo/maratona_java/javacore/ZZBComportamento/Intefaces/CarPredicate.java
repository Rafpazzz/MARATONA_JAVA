package academy.devdojo.maratona_java.javacore.ZZBComportamento.Intefaces;

import academy.devdojo.maratona_java.javacore.ZZBComportamento.domain.Car;

@FunctionalInterface //interface funcional: apenas um metodo abstrato
public interface CarPredicate {
    //lambdas são anonimas, funções, codigo conciso
    boolean test(Car car);
    //(parametro) -> (expressao)
    //(Car car) -> car.getClor().equals("green")
}
