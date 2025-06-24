package academy.devdojo.maratona_java.javacore.ZZBComportamento.test;

import academy.devdojo.maratona_java.javacore.ZZBComportamento.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoProParametroTest01 {
    private static List<Car> carros = List.of(new Car("green", 2011), new Car("red", 1999), new Car("Black", 2025));

    private static List<Car> filterGreenCar(List<Car> cars) {
        List<Car> greenCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals("green")) {
                greenCars.add(car);
            }
        }

        return greenCars;
    }

    private static List<Car> filterCarByColor(List<Car> cars, String color) {
        List<Car> listCar = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals(color)) {
                listCar.add(car);
            }
        }

        return listCar;
    }

    private static List<Car> filterCarBeforeAge (List<Car> cars, int year) {
        List<Car> listCar = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear() < year) {
                listCar.add(car);
            }
        }

        return listCar;
    }


    public static void main(String[] args) {

        System.out.println(filterCarByColor(carros,"red"));
        System.out.println(filterCarBeforeAge(carros,1990));

    }

}
