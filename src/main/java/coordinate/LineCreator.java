package coordinate;

import java.util.List;

public class LineCreator implements FigureCreator {

    @Override
    public Figure create(List<Points> pointsList) {
        return new Line(pointsList);
    }
}
