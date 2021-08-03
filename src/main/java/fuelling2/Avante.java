package fuelling2;

import fuelling.Distance;
import fuelling.Mileage;
import fuelling.Name;

public class Avante implements Car {
    private Name name;
    private Distance distance;
    private final static Mileage mileage = new Mileage(15);

    public Avante(int distance) {
        this.name = new Name("Avante");
        this.distance = new Distance(distance);
    }

    @Override
    public double getDistancePerLiter() {
        return mileage.getValue();
    }

    @Override
    public double getTripDistance() {
        return distance.getValue();
    }

    @Override
    public String getName() {
        return name.getValue();
    }

}
