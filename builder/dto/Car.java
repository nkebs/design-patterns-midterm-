package midterm.builder.dto;

public class Car {
    private final double engineSize;
    private final int seats;
    private final String transmission;

    public Car(double engineSize, int seats, String transmission) {
        this.engineSize = engineSize;
        this.seats = seats;
        this.transmission = transmission;
    }

    public double getEngineSize() {
        return engineSize;
    }

    public int getSeats() {
        return seats;
    }

    public String getTransmission() {
        return transmission;
    }

    @Override
    public String toString() {
        return  " engineSize = " + engineSize +
                ", seats = " + seats +
                ", transmission = " + transmission;
    }
}
