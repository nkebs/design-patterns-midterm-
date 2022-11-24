package midterm.builder.implementations;

import midterm.builder.dto.Car;
import midterm.builder.interfaces.Builder;

public class CarBuilder implements Builder {
    private double engineSize;
    private int seats;
    private String transmission;

    @Override
    public void setEngineSize(double engineSize) {
        this.engineSize = engineSize;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public Car build() {
        return new Car(engineSize, seats, transmission);
    }
}
