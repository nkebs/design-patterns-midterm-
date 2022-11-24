package midterm.builder.director;

import midterm.builder.interfaces.Builder;

public class Director {

    public void constructSportsCar(Builder builder) {
        builder.setSeats(2);
        builder.setEngineSize(3.2);
        builder.setTransmission("Manual");
    }

    public void constructCityCar(Builder builder) {
        builder.setSeats(4);
        builder.setEngineSize(1.8);
        builder.setTransmission("Automatic");
    }
}