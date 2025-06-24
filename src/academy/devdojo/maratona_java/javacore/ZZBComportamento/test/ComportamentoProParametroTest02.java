package academy.devdojo.maratona_java.javacore.ZZBComportamento.test;

import academy.devdojo.maratona_java.javacore.ZZBComportamento.Intefaces.CarPredicate;
import academy.devdojo.maratona_java.javacore.ZZBComportamento.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoProParametroTest02 {
    private static List<Car> carros = List.of(new Car("green", 2011), new Car("red", 1999), new Car("Black", 2025));

    public static void main(String[] args) {
//        List<Car> greenCars = filter(carros, new CarPredicate() {
//            @Override
//            public boolean test(Car car) {
//                return car.getColor().equals("green");
//            }
//        });

        List<Car> greenCars = filter(carros, car -> car.getColor().equals("green"));

        System.out.println(greenCars);
    }

    private static List<Car> filter(List<Car> cars, CarPredicate carPredicate) {
        List<Car> listCar = new ArrayList<>();
        for (Car car : cars) {
            if (carPredicate.test(car)) {
                listCar.add(car);
            }
        }

        return listCar;
    }
}
