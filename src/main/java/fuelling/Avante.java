package fuelling;

public class Avante extends Car {
    public Avante(int mileage) {
        super();
    }

    @Override
    double getDistancePerLiter() {
        return 0;
    }

    @Override
    double getTripDistance() {
        return 0;
    }

    @Override
    String getName() {
        return null;
    }
}
