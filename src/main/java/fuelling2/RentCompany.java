package fuelling2;

import java.util.ArrayList;
import java.util.List;

public class RentCompany {
    private static List<Car> cars = new ArrayList<>();
    private static final String NEWLINE = System.getProperty("line.separator");

    public void addCar(Car car) {
        cars.add(car);
    }

    public String generateReport() {
        StringBuilder result = new StringBuilder();
        for (Car car : cars) {
            String temp = car.getName() + " : " + (int)car.getChargeQuantity() + "리터" + NEWLINE;
            result.append(temp);
        }
        return result.toString();
    }
}
