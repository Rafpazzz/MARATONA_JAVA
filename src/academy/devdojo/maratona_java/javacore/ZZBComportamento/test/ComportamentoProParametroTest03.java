package academy.devdojo.maratona_java.javacore.ZZBComportamento.test;

import academy.devdojo.maratona_java.javacore.ZZBComportamento.Intefaces.CarPredicate;
import academy.devdojo.maratona_java.javacore.ZZBComportamento.domain.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoProParametroTest03 {
    private static List<Car> carros = List.of(new Car("green", 2011), new Car("red", 1999), new Car("Black", 2025));

    public static void main(String[] args) {
//        List<Car> greenCars = filter(carros, new CarPredicate() {
//            @Override
//            public boolean test(Car car) {
//                return car.getColor().equals("green");
//            }
//        });

        List<Car> greenCars = Filter(carros, car -> car.getColor().equals("green"));
        System.out.println(greenCars);

        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println("Numeros Pares: " + Filter(nums, num -> num % 2 == 0));
        System.out.println("Numeros Impares: " + Filter(nums, a -> a % 2 != 0));

    }

    private static <T> List<T> Filter(List<T> list, Predicate<T> predicate) {
        List<T> filterList = new ArrayList<>();

        for (T e : list) {
            if (predicate.test(e)) {
                filterList.add(e);
            }
        }

        return filterList;
    }
}
