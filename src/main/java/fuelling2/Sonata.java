package fuelling2;

import fuelling.Distance;
import fuelling.Mileage;
import fuelling.Name;

public class Sonata implements Car {
    private Name name;
    private Distance distance;
    private final static Mileage mileage = new Mileage(10);

    public Sonata(int distance) {
        this.name = new Name("Sonata");
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
