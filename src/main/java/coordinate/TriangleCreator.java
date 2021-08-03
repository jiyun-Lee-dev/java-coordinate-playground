package coordinate;

import java.util.List;

public class TriangleCreator implements FigureCreator {

    @Override
    public Figure create(List<Points> pointsList) {
        return new Triangle(pointsList);
    }
}
