package coordinate;

import java.util.Arrays;
import java.util.List;

public class Triangle implements Figure {
    private List<Points> pointsList;

    public Triangle(List<Points> pointsList) {
        this.pointsList = pointsList;
    }

    @Override
    public double measure() {
        Line firstLine = new Line(Arrays.asList(pointsList.get(0), pointsList.get(1)));
        Line secondLine = new Line(Arrays.asList(pointsList.get(1), pointsList.get(2)));
        Line thirdLine = new Line(Arrays.asList(pointsList.get(0), pointsList.get(2)));
        double s = (firstLine.measure() + secondLine.measure() + thirdLine.measure()) / 2;
        return Math.sqrt(s * (s - firstLine.measure()) * (s - secondLine.measure()) * (s - thirdLine.measure()));
    }
}
