package midterm.builder;

import midterm.builder.director.Director;
import midterm.builder.dto.Car;
import midterm.builder.implementations.CarBuilder;

public class Main {

    public static void main(String[] args) {
        Director director = new Director();

        //build sports car
        CarBuilder sportsCarBuilder = new CarBuilder();
        director.constructSportsCar(sportsCarBuilder);

        Car sportsCar = sportsCarBuilder.build();
        System.out.println("Car built:\n" + sportsCar.toString());

        //build city car
        CarBuilder cityCarBuilder = new CarBuilder();
        director.constructCityCar(cityCarBuilder);

        Car cityCar = cityCarBuilder.build();
        System.out.println("Car built:\n" + cityCar.toString());
    }
}
