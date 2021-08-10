package coordinate.model;

import java.util.List;

public class Line extends AbstractFigure {
    private static final String INFO_START_MESSAGE = "두 점 사이의 거리는 ";
    public Line(List<Point> points) {
        super(points);
    }

    @Override
    public double getArea() {
        return getPoints().get(0).calculateDistance(getPoints().get(1));
    }

    @Override
    public String getAreaInfo() {
        return INFO_START_MESSAGE + getArea();
    }
}
